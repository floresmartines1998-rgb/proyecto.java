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
public class Reporte {
    

    // a. Inventario completo
    public  static void inventario(Gestioestante inv){

        String invencomple = "";

<<<<<<< HEAD
        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] != null){
                        invencomple += inv.estantes[estante][fila][columna].getTitulo() +
                                 " (Estante " + estante +
                                 ", Fila " + fila +
                                 ", Columna " + columna + ")\n";
=======
        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] != null){
                        invencomple += inv.estantes[e][f][c].getTitulo() +
                                 " ("+e+","+f+","+c+")\n";
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, invencomple);
    }

<<<<<<< HEAD
    // b. Espacios vacíos
=======
    // b. Bajo stock (vacíos)
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
    public static void vacios(Gestioestante inv){

        String stockvacios = "";

<<<<<<< HEAD
        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] == null){
                        stockvacios += "(Estante " + estante +
                                        ", Fila " + fila +
                                        ", Columna " + columna + ")\n";
=======
        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] == null){
                        stockvacios += "("+e+","+f+","+c+")\n";
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, stockvacios);
    }

    // c. Ventas
    public static void Repventas(){

        String rv = "";
        double total = 0;

        for(Ventas v : Ventas.historial){
            rv += v.getLibro().getTitulo() +
<<<<<<< HEAD
                  " - " + v.getTotal() + "\n";
=======
                     " - " + v.getTotal() + "\n";
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
            total += v.getTotal();
        }

        rv += "\nTOTAL: " + total;

        JOptionPane.showMessageDialog(null, rv);
    }

    // d. Ocupación
    public static void ocupacion(Gestioestante inv){

        int libres = 0;
        int ocupados = 0;

<<<<<<< HEAD
        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] == null){
=======
        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] == null){
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                        libres++;
                    }else{
                        ocupados++;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null,
            "Libres: " + libres + "\nOcupados: " + ocupados);
    }

<<<<<<< HEAD
    // e. Buscar por título o código
    public static void buscar(Gestioestante inv, String dato){

        String texto = "";

        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] != null){

                        if(inv.estantes[estante][fila][columna].getTitulo().equalsIgnoreCase(dato) ||
                           inv.estantes[estante][fila][columna].getCodigo().equalsIgnoreCase(dato)){

                            texto += "Libro: " + inv.estantes[estante][fila][columna].getTitulo() + "\n" +
                                     "Ubicación: Estante " + estante +
                                     ", Fila " + fila +
                                     ", Columna " + columna + "\n\n";
=======
    // e. Buscar por título
    public static void buscar(Gestioestante inv, String titulo){

        String texto = "";

        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] != null){

                        if(inv.estantes[e][f][c].getTitulo().equalsIgnoreCase(titulo)){
                            texto += "("+e+","+f+","+c+")\n";
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                        }
                    }
                }
            }
        }

<<<<<<< HEAD
        if(texto.equals("")){
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        } else {
            JOptionPane.showMessageDialog(null, texto);
        }
    }
}
=======
        JOptionPane.showMessageDialog(null, texto);
    }
}
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
