package com.mauro318210134.simuladorvendas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView lblVersao, lblVersaoSelecionada, lblTotalVersao, lblAcessorio, lblAcessorioSelecionado, lblTotalAcessorio, lblTotalGeral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblVersao = findViewById(R.id.lblVersao);
        lblVersaoSelecionada = findViewById(R.id.lblVersaoSelecionada);
        lblTotalVersao = findViewById(R.id.lblTotalVersao);

        lblVersao.setOnClickListener(cliqueBotaoVersao);
        lblVersaoSelecionada.setOnClickListener(cliqueBotaoVersao);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        float total= 0;
        if(requestCode == 1000 && resultCode == 1){
            float valor = data.getFloatExtra("valor", 0);
            String descricao = data.getStringExtra("descricao");
            total = total + valor;
            lblVersaoSelecionada.setText(descricao);
            lblTotalVersao.setText("R" + NumberFormat.getCurrencyInstance().format(valor));
        }

        lblTotalGeral.setText("R" + NumberFormat.getCurrencyInstance().format(total));
    }
}
