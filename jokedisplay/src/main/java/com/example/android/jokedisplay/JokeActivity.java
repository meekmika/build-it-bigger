package com.example.android.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView mJokeDisplay = findViewById(R.id.joke_display);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("joke")) {
            String jokeString = intent.getStringExtra("joke");
            mJokeDisplay.setText(jokeString);
        }
    }
}
