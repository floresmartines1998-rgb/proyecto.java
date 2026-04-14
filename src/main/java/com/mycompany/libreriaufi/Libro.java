/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

import javax.swing.JOptionPane;

/**
 *
 * @author H
 */
public class Libro {   

    public String codigo;
    public String titulo;
    public String autor;
    public String categoria;
    public int cantidad;
    public double precio;
<<<<<<< HEAD
    public Ubicacion ubicacion;
=======
    public Ubicacion Ubicacion;
    
    
    
    
    //construtor vacio 
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a

    /**
     * Constructor vacío
     */
    public Libro() {
    }

    /**
     * Constructor completo
     */
    public Libro(String codigo, String titulo, String autor, String categoria,
                 int cantidad, double precio, Ubicacion ubicacion) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    // GETTERS

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
        return ubicacion;
    }

    // SETTERS

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
<<<<<<< HEAD

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Reduce el stock del libro cuando se vende
     */
    public void reducirStock(int vendido) {
        this.cantidad -= vendido;
    }

    /**
     * Muestra la información del libro
     */
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Código: " + codigo + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Categoría: " + categoria + "\n" +
                "Precio: " + precio + "\n" +
                "Ubicación: " + (ubicacion != null ? ubicacion.ubicacion1() : "Sin asignar")
        );
    }
=======
     //asignar o cambiar ubicacion 
    public void setUbicacion(Ubicacion Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
    public void reducstock(int vendido){
        this.cantidad -= vendido;
    }
    // nota  arreglar el salto de pagina 
    public void mostratubi(){
        JOptionPane.showInternalMessageDialog(null,
                "codigo: "+codigo+
                "Ntitulo: "+titulo+
                "nautor: "+autor+
                "ncategoria "+categoria+
                "nprecio: "+precio+
                "nubicacion: "+Ubicacion);
    }
    
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
}