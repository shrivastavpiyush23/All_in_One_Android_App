package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    Button b51;
    EditText e20;
    CountryCodePicker cpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b51 = (Button)findViewById(R.id.button51);
        e20 = (EditText)findViewById(R.id.editText20);
        cpp = (CountryCodePicker)findViewById(R.id.cpp);
        cpp.registerCarrierNumberEditText(e20);

        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OTP2.class);
                i.putExtra("mobile",cpp.getFullNumberWithPlus().trim());
                startActivity(i);
                finish();
            }
        });
    }
}