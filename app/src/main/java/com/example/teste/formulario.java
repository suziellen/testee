package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class formulario extends AppCompatActivity {
    public EditText nome;
    public EditText email;
    public EditText data;
    public EditText telefone;
    public EditText mensagem;
    public EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void telaresul(View view){

        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        data = findViewById(R.id.datanasc);
        telefone = findViewById(R.id.telefone);
        mensagem = findViewById(R.id.mensagem);
        senha = findViewById(R.id.senha);

        String nomeTexto = nome.getText().toString();
        String emailTexto = email.getText().toString();
        String dataTexto = data.getText().toString();
        String telefoneTexto = telefone.getText().toString();
        String mensagemTexto = mensagem.getText().toString();
        String senhaTexto = senha.getText().toString();

        Intent intent = new Intent (this, resutado.class);

        intent.putExtra("nome", nomeTexto);
        intent.putExtra("email", emailTexto);
        intent.putExtra("data",dataTexto);
        intent.putExtra("telefone", telefoneTexto);
        intent.putExtra("mensagem", mensagemTexto);
        intent.putExtra("senha", senhaTexto);

        startActivity(intent);
    }
}
