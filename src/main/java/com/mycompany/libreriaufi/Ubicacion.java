/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;

/**
 *
 * @author H
 */
public class Ubicacion {
    
    public int estante;
    public int fila;
    public int columna;

    public Ubicacion() {
    }

    public Ubicacion(int estante, int fila, int columna) {
        this.estante = estante;
        this.fila = fila;
        this.columna = columna;
    }

    public int getEstante() {
        return estante;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
<<<<<<< HEAD

    // Mejorado
    public String ubicacion1(){
        return "Estante: " + estante + 
               ", Fila: " + fila + 
               ", Columna: " + columna;
=======
    // se usa para mostrar la ubicacion como terxto nadamas 
    public String ubicacion1(){
        return "Estante: " + this.estante + 
                "filas: " + this.fila + 
                "columna: " + this.columa;
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
    }
}
