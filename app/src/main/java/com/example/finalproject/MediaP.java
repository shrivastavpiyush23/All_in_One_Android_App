package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaP extends AppCompatActivity {

    Button b28, b29, b30;
    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_p);

        b28 = (Button)findViewById(R.id.button61);
        b29 = (Button)findViewById(R.id.button62);
        b30 = (Button)findViewById(R.id.button63);
        m1 = MediaPlayer.create(this, R.raw.song);

        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.pause();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MediaP.this, Apps.class);
                startActivity(i4);
                finish();
            }
        });
    }
}