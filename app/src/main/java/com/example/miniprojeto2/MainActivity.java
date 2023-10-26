package com.example.miniprojeto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] frases = {"frase boa", "frase legal", "frase mais ou menos"};
    private TextView fraseViewer;
    /*private Button btFrase;*/
    Button btFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fraseViewer = findViewById(R.id.fraseViewerXML);
        btFrase = findViewById(R.id.btFraseXML);

        // Criar listener para botao "btFrase" e
        // fazer a textview "fraseViewer" receber string do array "frases"
        // em um endereço aleatorio com o método random.java

        btFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation respostaBT = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                btFrase.startAnimation(respostaBT); // Resolver Animação em Loop
                int f = new Random().nextInt(frases.length);
                fraseViewer.setText(frases[f]);
            }
        });

    }


    /*public void gerarFrase(View view) {

        fraseViewer = findViewById(R.id.fraseViewerXML);
        btFrase = findViewById(R.id.btFraseXML);

        // Criar listener para botao "btFrase" e
        // fazer a textview "fraseViewer" receber string do array "frases"
        // em um endereço aleatorio com o método random.java

        btFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = new Random().nextInt(2);
                fraseViewer.setText(frases[f]);
            }
        });

    }*/
}