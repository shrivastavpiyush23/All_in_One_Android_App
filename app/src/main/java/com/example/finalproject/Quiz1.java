package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz1 extends AppCompatActivity {

    Button b45, b46;
    RadioButton r1, r2, r3, r4;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        b45 = (Button)findViewById(R.id.button45);
        b46 = (Button)findViewById(R.id.button46);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);

        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if(r1.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }
                Intent i23 = new Intent(Quiz1.this, Quiz2.class);
                startActivity(i23);
                finish();
            }
        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i24 = new Intent(Quiz1.this, Apps.class);
                startActivity(i24);
                finish();
            }
        });
    }
}