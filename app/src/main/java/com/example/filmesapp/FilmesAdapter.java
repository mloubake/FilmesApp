package com.example.filmesapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FilmesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> lista;
    Context context;

    FilmesAdapter(List<String> listaTitulos, Context context) {
        this.lista = listaTitulos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_filme, parent,false);
        FilmeViewHolder filmeViewHolder = new FilmeViewHolder(view);

        return filmeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((FilmeViewHolder) holder).titulo.setText(lista.get(position));

    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

    public class FilmeViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;

        FilmeViewHolder(View view) {
            super(view);
            titulo = view.findViewById(R.id.filme_titulo);
        }
    }
}
