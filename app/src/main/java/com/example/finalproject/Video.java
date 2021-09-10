package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video extends AppCompatActivity {

    Button b41, b42;
    VideoView v1;
    MediaController m2;
    Uri u2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        b41 = (Button)findViewById(R.id.button41);
        b42 = (Button)findViewById(R.id.button42);
        v1 = (VideoView)findViewById(R.id.videoView2);
        m2 = new MediaController(this);

        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i16,0);
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17 = new Intent(Video.this, Camera.class);
                startActivity(i17);
                finish();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        u2 = data.getData();
        v1.setVideoURI(u2);
        v1.setMediaController(m2);
        m2.setAnchorView(v1);
        v1.start();
    }
}