package com.example.filmesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * 1- Criar um gerador de títulos de filmes mockados (fakes);
     *
     * 2- Criar RecyclerView com títulos de filmes;
     *
     * 3- Criar um layout de cada item da lista do RecyclerView;
     *
     * 4- Criar um modelo de filmes;
     *
     * 5- Criar uma tela com detalhes do filme selecionado;
     *
     * Ao final, vamos ter uma app que exibe uma lista de Posteres de filmes, trazendo de uma API,
     * mostrando os detalhes e os reviews desses filmes.
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.listaFilme);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        FilmesAdapter mFilmesAdapter = new FilmesAdapter(gerarFilmes(),this);
        mRecyclerView.setAdapter(mFilmesAdapter);

    }

    public List<String> gerarFilmes() {

        List<String> tituloFilme = new ArrayList<>();

        tituloFilme.add("E o Vento Levou");
        tituloFilme.add("Titanic");
        tituloFilme.add("Madagascar");
        tituloFilme.add("Bastardos Inglórios");
        tituloFilme.add("A Origem");
        tituloFilme.add("A Ilha do Medo");
        tituloFilme.add("Silêncio dos Inocentes");
        tituloFilme.add("Dragão Vermelho");
        tituloFilme.add("O Labirinto do Fauno");

        return tituloFilme;
    }
}
