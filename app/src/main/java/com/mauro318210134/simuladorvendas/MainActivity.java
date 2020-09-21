package com.mauro318210134.simuladorvendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblVersao, lblVersaoSelecionada, lblTotalVersao, lblAcessorio, lblAcessorioSelecionado, lblTotalAcessorio, lblTotalGeral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblVersao = findViewById(R.id.lblVersao);
        lblVersao.setOnClickListener(cliqueBotaoVersao);

        lblVersaoSelecionada = findViewById(R.id.lblVersaoSelecionada);
        lblVersaoSelecionada.setOnClickListener(cliqueBotaoVersao);
        
        lblTotalVersao = findViewById(R.id.lblTotalVersao);
        lblTotalVersao.setOnClickListener(cliqueBotaoVersao);

        lblAcessorio = findViewById(R.id.lblAcessorio);
        lblAcessorioSelecionado = findViewById(R.id.lblAcessorioSelecionado);
        lblTotalAcessorio = findViewById(R.id.lblTotalAcessorio);
        lblTotalGeral = findViewById(R.id.lblTotalGeral);
    }

    View.OnClickListener cliqueBotaoVersao = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, VersaoActivity.class);
            startActivityForResult(intent, 1000);
        }
    };
}
