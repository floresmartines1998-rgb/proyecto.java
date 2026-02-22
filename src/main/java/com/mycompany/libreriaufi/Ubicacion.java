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
    public int columa;

    public Ubicacion() { // construtor vacio/ para evitar errores 
        
    }

    public Ubicacion(int estante, int fila, int columa) {
        this.estante = estante;
        this.fila = fila;
        this.columa = columa;
    }

    public int getEstante() {
        return estante;
    }

    public int getFila() {
        return fila;
    }

    public int getColuma() {
        return columa;
    }
    
    public String ubicacion1(){
        return "Estante: " + this.estante + "filas: " + this.fila + "columna" + this.columa;
    }
    
    
    
    
    
}
