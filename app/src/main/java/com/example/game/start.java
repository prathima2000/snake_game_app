package com.example.game;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    private Button start,rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        start = (Button) findViewById(R.id.button);
        rules = (Button) findViewById(R.id.rules);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity1();
            }
        });
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
    }






    private void launchActivity1() {

        Intent intent = new Intent(this,snake.class);
        startActivity(intent);
    }
    private void launchActivity() {

        Intent intent = new Intent(this,rules.class);
        startActivity(intent);
    }

}