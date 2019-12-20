package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resutado extends AppCompatActivity {
    public TextView nomeCampo;
    public TextView emailCampo;
    public TextView dataCampo;
    public TextView telefoneCampo;
    public TextView mensagemCampo;
    public TextView senhaCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resutado);


         Bundle bundle = getIntent().getExtras();

                if(bundle != null){

                    String nome = bundle.getString("nome");
                    String email = bundle.getString("email");
                    String data = bundle.getString("data");
                    String telefone = bundle.getString("telefone");
                    String mensagem = bundle.getString("mensagem");
                    String senha = bundle.getString("senha");

                    nomeCampo = findViewById(R.id.textViewNome);
                    nomeCampo.setText(nome);

                    emailCampo = findViewById(R.id.textViewEmail);
                    emailCampo.setText(email);

                    dataCampo = findViewById(R.id.textViewData);
                    dataCampo.setText(data);

                    telefoneCampo = findViewById(R.id.textViewTell);
                    telefoneCampo.setText(telefone);

                    mensagemCampo = findViewById(R.id.textViewMensagem);
                    mensagemCampo.setText(mensagem);

                    senhaCampo = findViewById(R.id.textViewSenha);
                    senhaCampo.setText(senha);

                }

    }
}
