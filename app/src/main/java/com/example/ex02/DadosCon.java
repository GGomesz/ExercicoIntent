package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DadosCon extends AppCompatActivity {

    TextView nome;
    TextView sala;
    TextView curso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_con);

        nome = (TextView) findViewById(R.id.txtNome);
        sala = (TextView) findViewById(R.id.txt_sala);
        curso = (TextView) findViewById(R.id.txt_curso);

        Intent it = getIntent();

        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                String strNome = params.getString(("nome"));
                String strTelefone = params.getString(("telefone"));
                String strEndereco = params.getString(("endereco"));
                nome.setText(strNome.toString());
                sala.setText(strTelefone.toString());
                curso.setText(strEndereco.toString());
            }
        }
    }
}