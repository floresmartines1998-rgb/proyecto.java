/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreriaufi;

/**
 *
 * @author H
 */
public class LibreriaUFI {

    //prueba de subida en gib
    
    public static void main(String[] args) {
         
        
        
        
        // Creamos dos productos
        Libro Libro1 = new Libro();
        Libro Libro2 = new Libro();
        
        // Damos valores a los atributos de los productos
        Libro1.setNombre(" ");
        Libro2.setNombre(" ");
        
        nuevoInventario.agregarLibro(Libro1);
        nuevoInventario.agregarLibro(Libro2);
        
        String LibroTotales = nuevoInventario.mostrarLibro();
        System.out.println("Los Libro del Inventario son: \n" + LibroTotales);
        
        
        
    }
}
