package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class OTP2 extends AppCompatActivity {

    EditText e21;
    Button b52;
    String phone;
    String otp;
    FirebaseAuth fa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp2);

        phone = getIntent().getStringExtra("mobile").toString();
        b52 = (Button) findViewById(R.id.button52);
        e21 = (EditText) findViewById(R.id.editText21);
        fa = FirebaseAuth.getInstance();
        genotp();

        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e21.getText().toString().isEmpty()) {
                    Toast.makeText(OTP2.this, "Enter OTP", Toast.LENGTH_SHORT).show();
                } else {
                    if (e21.getText().toString().length() != 6) {
                        Toast.makeText(OTP2.this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                    } else {
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(otp, e21.getText().toString());
                        signInWithPhoneAuthCredentials(credential);
                    }
                }
            }
        });
    }

    private void genotp()
    {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phone,
                60,
                TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                    @Override
                    public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(s, forceResendingToken);
                        otp = s;
                    }

                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                        signInWithPhoneAuthCredentials(phoneAuthCredential);
                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        Toast.makeText(OTP2.this, "OTP mismatched", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    private void signInWithPhoneAuthCredentials(PhoneAuthCredential credential){
        fa.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(OTP2.this, "Logged in!", Toast.LENGTH_SHORT).show();
                    Intent i30 = new Intent(OTP2.this, OTP3.class);
                    startActivity(i30);
                    finish();
                }
                else
                {
                    Toast.makeText(OTP2.this, "not done", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}