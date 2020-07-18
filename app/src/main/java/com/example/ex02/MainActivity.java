package com.example.ex02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity  {

    EditText nome;
    EditText sala;
    EditText curso;
    Button btnConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.ed_nome);
        sala = (EditText) findViewById(R.id.ed_sala);
        curso = (EditText) findViewById(R.id.ed_curso);
        btnConsulta = (Button) findViewById(R.id.btn_Consultar);

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dados = new Intent (MainActivity.this, DadosCon.class);
                Bundle params = new Bundle();

                params.putString("nome", nome.getText().toString());
                params.putString("telefone", sala.getText().toString());
                params.putString("endereco", curso.getText().toString());
                dados.putExtras(params);
                startActivity(dados);

            }
        });
    }
}