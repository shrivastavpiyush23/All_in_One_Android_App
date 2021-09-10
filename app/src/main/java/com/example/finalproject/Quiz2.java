package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz2 extends AppCompatActivity {

    RadioButton r5,r6,r7,r8;
    Button b48, b47;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        b47 = (Button)findViewById(R.id.button47);
        b48 = (Button)findViewById(R.id.button48);
        r5 = (RadioButton)findViewById(R.id.radioButton5);
        r6 = (RadioButton)findViewById(R.id.radioButton6);
        r7 = (RadioButton)findViewById(R.id.radioButton7);
        r8 = (RadioButton)findViewById(R.id.radioButton8);

        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r5.isChecked())
                {
                    ++Quiz1.score;
                }
                else
                {
                    --Quiz1.score;
                }
                Intent i25 = new Intent(Quiz2.this, Quiz3.class);
                startActivity(i25);
                finish();
            }
        });
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i28 = new Intent(Quiz2.this, Quiz1.class);
                startActivity(i28);
                finish();
            }
        });
    }
}