/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/**
 *
 * @author H
 */

//parte de gestion  de estantes
public class Gestioestante {
<<<<<<< HEAD
    
    private static final short CANT_ESTANTE = 5;
    private static final short CANT_FILAS = 5;
    private static final short CANT_COLUMNAS = 5;

    public Libro[][][] estantes;

    /**
     * Constructor que crea la matriz de estantes
     */
    public Gestioestante() {
        estantes = new Libro[CANT_ESTANTE][CANT_FILAS][CANT_COLUMNAS];
    }

    /**
     * Guarda un libro en una posición específica
     */
    public void libroguardado(int estante, int fila, int columna, Libro libro) {

        try {
            if (estantes[estante][fila][columna] == null) {

                estantes[estante][fila][columna] = libro;
                libro.setUbicacion(new Ubicacion(estante, fila, columna));

                JOptionPane.showMessageDialog(null, "Libro guardado correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Posición ocupada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fuera de rango");
        }
    }  

    /**
     * Muestra el mapa del estante
     */
    public String mapaestante(int estante) {

        if (estante < 0 || estante >= estantes.length) {
            return "Estante fuera de rango";
        }

        String map = "Mapa del estante " + estante + "\n\n";

        for (int i = 0; i < estantes[estante].length; i++) {
            for (int j = 0; j < estantes[estante][i].length; j++) {

                if (estantes[estante][i][j] == null) {
                    map += "[Libre]\t";
                } else {
                    map += "[" + estantes[estante][i][j].getTitulo() + "]\t";
                }
            }
            map += "\n";
        }

        return map;
         }
     }
            
=======
    private static final short CANT_ESTANTE = 5;
    private static final short CANT_FILAS = 5;
    private static final short CANT_COLUMNAS = 5;
    
    //tenemos lo que arreglo 
    public Libro [][][] estantes ;
    
    //contrutor  con su arreglo 
    public Gestioestante() {
        this.estantes = new Libro[CANT_ESTANTE][CANT_FILAS][CANT_COLUMNAS];
    }
    //metodo para guardar un libro 
    public void libroguardado(int e, int f, int c, Libro Libro1 ){
        
        try {   
            //secrea un if para que no se suscriba un libro sobre otro
           if(estantes[e][f][c] == null){
               
                estantes[e][f][c] = Libro1;
                Libro1.setUbicacion(new Ubicacion(e,f,c));
                JOptionPane.showMessageDialog(null, "libro guardado");
           }else{
               JOptionPane.showMessageDialog(null, "posicion ocupada");
           }
             
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "fuera del rango");
            
        }
    }
    
    //     mapa del estante
    public String mapaestante(int estante){
        if(estante < 0 || estante >= estantes.length){
            return "esta fuera del rango";
        }
        String map = "Mapá del estante" + estante + "\n\n";
        for (int i = 0; i < estantes[estante].length; i++){
            
            for(int j = 0; j < estantes[estante][i].length; j++){
                
              
              
                //[V] = vacio  [lleno] = lleno
                map += (estantes[estante][i][j] == null) ? "[vacio ]" : "[lleno]"; 
            }
            map += "\n";
        }
        return map;
    }
    
    
    
    
    
    
    
}
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
