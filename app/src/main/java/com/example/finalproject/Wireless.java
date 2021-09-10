package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Wireless extends AppCompatActivity {

    Button b31;
    Switch sb1;

    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wireless);

        b31 = (Button)findViewById(R.id.button31);
        sb1 = (Switch)findViewById(R.id.switch1);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        sb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    bluetoothAdapter.enable();
                }
                else
                {
                    bluetoothAdapter.disable();
                }
            }
        });


        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Wireless.this, Apps.class);
                startActivity(i5);
                finish();
            }
        });

    }
}