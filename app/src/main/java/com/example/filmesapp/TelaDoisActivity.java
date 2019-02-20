package com.example.filmesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TelaDoisActivity extends AppCompatActivity {

    static final String EXTRA_INFORMACAO = "informacao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);

        TextView textViewInformacao = findViewById(R.id.textViewInformacao);

        if(getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            textViewInformacao.setText(bundle.getString(EXTRA_INFORMACAO));
        }

    }


}
