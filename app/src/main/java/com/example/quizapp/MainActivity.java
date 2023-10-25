package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView totalQuestionsTextView;
    TextView questionsTextView;

    Button resA;
    Button resB;
    Button resC;
    Button resD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        totalQuestionsTextView = findViewById(R.id.total)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}