package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    VideoView v1;
    Button b35;
    MediaController m1;
    Uri u1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        v1 = (VideoView)findViewById(R.id.videoView);
        m1 = new MediaController(this);
        b35 = (Button)findViewById(R.id.button35);
        v1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.netcamp);

        v1.setMediaController(m1);
        m1.setAnchorView(v1);
        v1.start();

        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(VideoPlayer.this, Apps.class);
                startActivity(i9);
                finish();
            }
        });
    }
}