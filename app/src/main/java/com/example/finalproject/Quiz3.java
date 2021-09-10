package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {

    TextView t;
    Button b49, b50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        t = (TextView)findViewById(R.id.textView6);
        b49 = (Button)findViewById(R.id.button49);
        b50 = (Button)findViewById(R.id.button50);

        t.setText("You scored "+Quiz1.score);

        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i26 = new Intent(Quiz3.this, Quiz1.class);
                startActivity(i26);
                finish();
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i27 = new Intent(Quiz3.this, Apps.class);
                startActivity(i27);
                finish();
            }
        });
    }
}