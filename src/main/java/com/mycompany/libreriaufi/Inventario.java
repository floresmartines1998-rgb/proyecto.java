/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

/**
 *
 * @author H
 */
public class Inventario {
    //definir como agreagar los libros, vasn a haber algunis de forma fija o solo los que se pueden agregar
    
    public String mostrarLibros() {
        String salida = "";
        
        for (int i = 0; i < this.Libros.length; i++) {
            if(this.Libros[i] != null) {
                salida += this.Libros[i].getNombre() + " \n";
            }
        }
        
        return salida;
    }
    
}
