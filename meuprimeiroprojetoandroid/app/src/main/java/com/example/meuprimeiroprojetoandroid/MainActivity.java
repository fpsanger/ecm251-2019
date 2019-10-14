package com.example.meuprimeiroprojetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View view){
        EditText nome, senha;
        nome = (EditText)findViewById(R.id.editTextNome);
        senha = (EditText)findViewById(R.id.editTextSenha);
        if(nome.getText().toString() == "root" && senha.getText().toString() == "root"){

            Toast.makeText(getApplicationContext(),"Bem vindo!",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Login inválido",Toast.LENGTH_SHORT).show();
        }

    }
}
