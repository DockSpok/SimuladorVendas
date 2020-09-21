package com.mauro318210134.simuladorvendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblVersao, lblVersaoSelecionada, lblTotalVersao, lblAcessorio, lblAcessorioSelecionado, lblTotalAcessorio, lblTotalGeral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblVersao = findViewById(R.id.lblVersao);
        lblVersaoSelecionada = findViewById(R.id.lblVersaoSelecionada);
        lblTotalVersao = findViewById(R.id.lblTotalVersao);
        lblAcessorio = findViewById(R.id.lblAcessorio);
        lblAcessorioSelecionado = findViewById(R.id.lblAcessorioSelecionado);
        lblTotalAcessorio = findViewById(R.id.lblTotalAcessorio);
        lblTotalGeral = findViewById(R.id.lblTotalGeral);
    }
}
