package com.example.pcmonceff.aplicativo_se;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botaoLigar;
    Button botaoDesligar;
    Button botaoAumentar;
    Button botaoDiminuir;

    int temperatura = 2;

    TextView mostraTemperatura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLigar = (Button) findViewById(R.id.botaoLigar);
        botaoDesligar = (Button) findViewById(R.id.botaoDesligar);
        botaoAumentar = (Button) findViewById(R.id.botaoAumentar);
        botaoDiminuir = (Button) findViewById(R.id.botaoDiminuir);

        mostraTemperatura = (TextView) findViewById(R.id.textMostradorTemperatura);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        botaoAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostraTemperatura.setText(Integer.toString(temperatura) + ".00°C");
                temperatura = temperatura + 1;
            }
        });

        botaoDiminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostraTemperatura.setText(Integer.toString(temperatura) + ".00°C");
                temperatura = temperatura - 1;
            }
        });
    }


}
