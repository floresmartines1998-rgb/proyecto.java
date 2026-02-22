/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

/**
 *
 * @author H
 */
public class Libro {             //se clara los String a utilizar 
    public String codigo;
    public String titulo;
    public String autor;
    public String categoria;
    public int cantidad;
    public double precio;
    public Ubicacion Ubicacion;
    
    //construtor vacio 

    public Libro() {
        
    }
    
    
   // construrie por de fecto 
    public Libro(String codigo, String titulo, String autor, String categoria, int cantidad, double precio, Ubicacion Ubicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.Ubicacion = Ubicacion;
        
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public Ubicacion getUbicacion() {
        return Ubicacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setUbicacion(Ubicacion Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
    
    
    
}
