package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class Apps extends AppCompatActivity {

    Button b20, b21, b22,b23, b24, b25, b26, b43;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        b20 = (Button)findViewById(R.id.button20);
        b21 = (Button)findViewById(R.id.button21);
        b22 = (Button)findViewById(R.id.button22);
        b23 = (Button)findViewById(R.id.button23);
        b24 = (Button)findViewById(R.id.button24);
        b25 = (Button)findViewById(R.id.button25);
        b26 = (Button)findViewById(R.id.button26);
        b43 = (Button)findViewById(R.id.button43);
        t2 = (TextView)findViewById(R.id.textView2);

        b20.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Apps.this, Calculator.class);
                startActivity(i1);
                finish();
            }
        });
        b21.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Apps.this, MediaP.class);
                startActivity(i3);
                finish();
            }
        });
        b22.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Apps.this, Wireless.class);
                startActivity(i6);
                finish();
            }
        });
        b23.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(Apps.this, Torch.class);
                startActivity(i7);
                finish();
            }
        });
        b24.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(Apps.this, VideoPlayer.class);
                startActivity(i8);
                finish();
            }
        });
        b25.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(Apps.this, Camera.class);
                startActivity(i10);
                finish();
            }
        });
        b43.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i21 = new Intent(Apps.this, Quiz1.class);
                startActivity(i21);
                finish();
            }
        });
        b26.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i23 = new Intent(Apps.this, MainActivity.class);
                startActivity(i23);
                finish();
            }
        });
    }
}