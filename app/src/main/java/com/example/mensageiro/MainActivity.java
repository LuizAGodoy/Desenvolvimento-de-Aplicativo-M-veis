package com.example.mensageiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText text;
    private TextInputEditText mensagem;
    private Button enviar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text_telefone);
        mensagem = findViewById(R.id.text_mensagem);
        enviar = findViewById(R.id.enviar);

        enviar.setOnClickListener(view ->
                {
                    String telefone = text.getText().toString();
                    String stringmensagem = mensagem.getText().toString();

                    Uri webpage = Uri.parse("https://wa.me/"+telefone+"?text=" + stringmensagem);

                    Intent webintent = new Intent(Intent.ACTION_VIEW, webpage);

                    startActivity(webintent);
                }


                );





    }
}