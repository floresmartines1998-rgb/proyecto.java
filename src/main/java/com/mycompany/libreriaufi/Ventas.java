/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

/**
 *
 * @author H
 */
public class Ventas {    //verificar si se agrega factura y fecha y hora 
    
    public Libro Libro;
    public int ventadelibro;    
    

    public Ventas() {
        
    }

    public Ventas(Libro Libro, int ventadelibro) {
        this.Libro = Libro;
        this.ventadelibro = ventadelibro;
    }
    
    public double totalventa(){
        return Libro.getPrecio() * ventadelibro;
    }
    
    
    
        
        
        
    
}
