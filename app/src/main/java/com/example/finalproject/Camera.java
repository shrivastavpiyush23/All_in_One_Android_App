package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Camera extends AppCompatActivity {

    Button b36, b37, b38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        b36 = (Button)findViewById(R.id.button36);
        b37 = (Button)findViewById(R.id.button37);
        b38 = (Button)findViewById(R.id.button38);

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(Camera.this, Photo.class);
                startActivity(i11);
                finish();
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(Camera.this, Video.class);
                startActivity(i12);
                finish();
            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13 = new Intent(Camera.this, Apps.class);
                startActivity(i13);
                finish();
            }
        });
    }
}