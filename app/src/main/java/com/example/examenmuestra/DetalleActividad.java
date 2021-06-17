package com.example.examenmuestra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalleActividad extends AppCompatActivity implements View.OnClickListener {
    TextView nombre;
    TextView precio;
    TextView codigo;
    TextView descripcion;
    ImageView imagenproducto;
    ImageButton btanterior;
    ImageButton btsiguiente;

    int[] galeriaImagenes;
    int i = 0;
    int totalImagenes = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_actividad);

        nombre = (TextView) findViewById(R.id.tvDetalleNombre);
        precio = (TextView) findViewById(R.id.tvDetallePrecio);
        codigo = (TextView) findViewById(R.id.tvDetalleCodigo);
        descripcion = (TextView) findViewById(R.id.tvDetalleDescripcion);
        imagenproducto = (ImageView) findViewById(R.id.ivImagenes);
        btanterior = (ImageButton) findViewById(R.id.botonAnterior);
        btsiguiente = (ImageButton) findViewById(R.id.botonSiguiente);

        Bundle bundle = getIntent().getExtras();
        Producto obj = (Producto) bundle.getSerializable("producto");

        nombre.setText(obj.getNombreProducto());
        precio.setText(obj.getPrecio() + "€");
        codigo.setText(obj.getIdProducto() + "");
        descripcion.setText(obj.getDescripcion());
        imagenproducto.setImageResource(obj.getImg());
        galeriaImagenes = obj.getGaleriaimgs();

        btanterior.setOnClickListener(this);
        btsiguiente.setOnClickListener(this);

        totalImagenes = galeriaImagenes.length;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.botonSiguiente:
                i++;
                if (i == totalImagenes)
                    i = 0;
                    break;


            case R.id.botonAnterior:
                i--;
                if (i == -1)
                    i = totalImagenes - 1;
                    break;
        }

        imagenproducto.setImageResource(galeriaImagenes[i]);


    }

   /* public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.botonSiguiente){
            i++;
            if(i==totalImagenes)
                i=0;
        }

        if(id==R.id.botonAnterior){
            i--;
            if(i==-1)
                i=totalImagenes-1;
        }
        imagenproducto.setImageResource(galeriaImagenes[i]);
    }*/
}