
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declarăm butonul și câmpul de text de pe ecranul principal
    Button butonulMeu;
    TextView textulMeu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Asociem activitatea cu interfața grafică
        setContentView(R.layout.activity_main);

        // Identificăm câmpul de text din interfață
        textulMeu = findViewById(R.id.textView);

        // Activăm funcționalitatea butonului
        activeazaButonul();
    }

    // Metodă care configurează acțiunea butonului
    public void activeazaButonul() {

        // Identificăm butonul din interfață
        butonulMeu = findViewById(R.id.button);

        // Stabilim ce se întâmplă atunci când apăsăm butonul
        butonulMeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creăm un Intent pentru deschiderea celei de-a doua activități
                Intent intentulMeu = new Intent(MainActivity.this,SecondActivity.class);

                // Deschidem a doua activitate
                startActivity(intentulMeu);
            }
        });
    }
}
