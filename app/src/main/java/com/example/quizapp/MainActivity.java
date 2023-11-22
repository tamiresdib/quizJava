package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonAustralia = findViewById(R.id.button2);
        final Button[] buttonOtherCountries = {
                findViewById(R.id.button1),
                findViewById(R.id.button3),
                findViewById(R.id.button4)
        };

        buttonAustralia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define a cor verde quando o botão Austrália é clicado
                buttonAustralia.setBackgroundColor(Color.GREEN);

                // Define a cor vermelha para os demais botões
                for (Button button : buttonOtherCountries) {
                    button.setBackgroundColor(Color.RED);
                }
            }
        });

        // Configura o ouvinte de clique para os outros botões
        for (final Button button : buttonOtherCountries) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Define a cor vermelha quando qualquer outro botão é clicado
                    button.setBackgroundColor(Color.RED);

                    // Define a cor verde para o botão Austrália
                    buttonAustralia.setBackgroundColor(Color.GREEN);
                }
            });
        }
    }
}
