package com.example.examenmuestra;

import java.io.Serializable;

public class Producto implements Serializable {
    private int idProducto;
    private String nombreProducto;
    private int img;
    private double precio;
    private String descripcion;
    private int[] galeriaimgs;

    public Producto(int idProducto, String nombreProducto, int img, double precio, String descripcion, int[] galeriaimgs) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.img = img;
        this.precio = precio;
        this.descripcion = descripcion;
        this.galeriaimgs = galeriaimgs;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int[] getGaleriaimgs() {
        return galeriaimgs;
    }

    public void setGaleriaimgs(int[] galeriaimgs) {
        this.galeriaimgs = galeriaimgs;
    }
}
