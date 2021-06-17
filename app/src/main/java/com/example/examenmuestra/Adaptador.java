package com.example.examenmuestra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Context miContexto;
    ArrayList<Producto> miArrayList;

    public Adaptador(Context miContexto, ArrayList<Producto> miArrayList) {
        this.miContexto = miContexto;
        this.miArrayList = miArrayList;
    }

    @Override
    public int getCount() {
        return miArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return miArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return miArrayList.get(position).getIdProducto();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflador = LayoutInflater.from(miContexto);
        view = inflador.inflate(R.layout.itemlistview, null);

        ImageView imagen = (ImageView) view.findViewById(R.id.ivImagen);
        TextView nombreProducto = (TextView) view.findViewById(R.id.tvNombreProducto);
        TextView descripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        TextView precio = (TextView) view.findViewById(R.id.tvPrecio);

        imagen.setImageResource(miArrayList.get(position).getImg());
        nombreProducto.setText(miArrayList.get(position).getNombreProducto());
        descripcion.setText(miArrayList.get(position).getDescripcion());
        precio.setText(miArrayList.get(position).getPrecio() + "€");


        return view;
    }
}
