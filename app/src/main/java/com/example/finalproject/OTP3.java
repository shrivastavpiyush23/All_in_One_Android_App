package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import android.os.Bundle;

public class OTP3 extends AppCompatActivity {

    Button b53, b54;
    EditText e24,e25,e26,e27;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp3);

        b53 = (Button)findViewById(R.id.button53);
        b54 = (Button)findViewById(R.id.button54);
        e24 = (EditText)findViewById(R.id.editText24);
        e25 = (EditText)findViewById(R.id.editText25);
        e26 = (EditText)findViewById(R.id.editText26);
        e27 = (EditText)findViewById(R.id.editText27);
        firebaseDatabase = FirebaseDatabase.getInstance();

        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference = firebaseDatabase.getReference("users");
                if(e27.length()!=10)
                {
                    Toast.makeText(OTP3.this, "Enter valid phone no.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String s1 = e24.getText().toString();
                    String s2 = e25.getText().toString();
                    String s3 = e26.getText().toString();
                    String s4 = e27.getText().toString();

                    users users = new users(s1,s2,s3,s4);
                    databaseReference.child(s4).setValue(users);
                    Toast.makeText(OTP3.this, "DB Updated!!", Toast.LENGTH_SHORT).show();
                }
                Intent i31 = new Intent(OTP3.this, Apps.class);
                startActivity(i31);
                finish();
            }
        });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i30 = new Intent(OTP3.this, MainActivity.class);
                startActivity(i30);
                finish();
            }
        });
    }
}