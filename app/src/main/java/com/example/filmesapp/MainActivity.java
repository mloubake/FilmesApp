package com.example.filmesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG  = "Método";
    
    /**
     * 1- Ciclo de vida - Feito
     *
     * 2- Criar uma tela simples: Um EditText e um botão - Feito
     *
     * 3- Ao clicar no botão, levar para uma nova tela - Feito
     *
     * 4- Refatorar para que exiba o valor digitado no EditText - Feito
     *
     * 5- Incluir um botão na segunda tela, que quando clicado, retorna a String concatenada com "123".
     * Essa string é então retornada para a tela 1, sendo exibida em um Toast..
     *
     * Ao final, vamos ter uma app que exibe uma lista de Posteres de filmes, trazendo de uma API,
     * mostrando os detalhes e os reviews desses filmes.
     */



    //Executado quando cria a tela. Primeiro método.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextInformacao = findViewById(R.id.editTextInformacao);
        final Button buttonTelaDois = findViewById(R.id.buttonTelaDois);

        buttonTelaDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaDoisActivity.class);
                Bundle bundleInfo = new Bundle();
                bundleInfo.putString(TelaDoisActivity.EXTRA_INFORMACAO, editTextInformacao.getText().toString());
                intent.putExtras(bundleInfo);
                startActivity(intent);
            }
        });

        Log.d(TAG, "onCreate: ");
    }


    //Executado assim que a activity está para ser visível para o usuário. Executado depois do onCreate.
    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    //Tela visível e interagível para/com o usuário. Executado depois do onStart.
    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: ");
    }

    //A activity começa a entrar no estado de não ser visível para o usuário. Executado depois do onResume. Dependendo do
    //fluxo, vai para o onStop ou volta para o onResume.
    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: ");
    }

    //A activity está totalmente invisível. Executado depois do onPause.
    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: ");
    }

    //Executa quando a activity está sendo reexibida para o usuário(Quando o usuário retorna para uma activity).
    //Executado depois do onStop. Executa logo em seguinda o onStart.
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: ");
    }

    //Executa quando a activity está preste a ser destruída. Executado depois do onStop.
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: ");
    }
}
