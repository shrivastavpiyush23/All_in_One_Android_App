package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Torch extends AppCompatActivity {

    Button b32, b33, b34;
    CameraManager cameraManager;
    private boolean torch = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);

        b32 = (Button)findViewById(R.id.button32);
        b33 = (Button)findViewById(R.id.button33);
        b34 = (Button)findViewById(R.id.button34);

        cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);

        b32.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try
                {
                    String id = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(id,true);
                    torch = true;
                }
                catch(CameraAccessException e)
                {
                }
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try
                {
                    String id = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(id,false);
                    torch = false;
                }
                catch(CameraAccessException e)
                {
                }
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(Torch.this, Apps.class);
                startActivity(i8);
                finish();
            }
        });
    }
}