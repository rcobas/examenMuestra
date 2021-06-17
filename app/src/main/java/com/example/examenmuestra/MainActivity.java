package com.example.examenmuestra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Producto> lista;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        lista = new ArrayList<Producto>();

        int[] galeriaTV = {R.drawable.galeria_tv1, R.drawable.galeria_tv2, R.drawable.galeria_tv3};
        int[] galeriaPlanchas = {R.drawable.galeria_plancha1, R.drawable.galeria_plancha2, R.drawable.galeria_plancha3};
        int[] galeriaMicrocadenas = {R.drawable.galeria_microcadena1, R.drawable.galeria_microcadena2, R.drawable.galeria_microcadena3};
        int[] galeriaPortatil = {R.drawable.galeria_portatil1, R.drawable.galeria_portatil2, R.drawable.galeria_portatil3, R.drawable.galeria_portatil4};

        lista.add(new Producto(1, "Televisor LG F21-40", R.drawable.televisor_lg, 399, "Televisor imagen 4K de 40 pulgadas 400Mhz", galeriaTV));
        lista.add(new Producto(2, "Microcadena Sony HT-100sd", R.drawable.minicadena_sony, 199, "Cadena musical conexión USB y iPod 40W", galeriaMicrocadenas));
        lista.add(new Producto(3, "Plancha Rowenta Soft FX-1", R.drawable.plancha_rowenta, 90, "Plancha profesional 7 funciones de planchado 1800W", galeriaPlanchas));
        lista.add(new Producto(4, "Ordenador Portatil Acer R235", R.drawable.portatil_acer, 589.90, "Ordenador Portatil Acer I5, 8GB, SSD240GB", galeriaPortatil));

        adaptador = new Adaptador(getApplicationContext(), lista);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Producto producto = (Producto) parent.getItemAtPosition(position);
                Intent i = new Intent(getApplicationContext(), DetalleActividad.class);
                i.putExtra("producto", producto);
                startActivity(i);
            }
        });
    }
}