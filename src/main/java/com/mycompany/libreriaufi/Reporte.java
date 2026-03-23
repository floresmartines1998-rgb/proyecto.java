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

        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] != null){
                        invencomple += inv.estantes[e][f][c].getTitulo() +
                                 " ("+e+","+f+","+c+")\n";
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, invencomple);
    }

    // b. Bajo stock (vacíos)
    public static void vacios(Gestioestante inv){

        String stockvacios = "";

        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] == null){
                        stockvacios += "("+e+","+f+","+c+")\n";
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
                     " - " + v.getTotal() + "\n";
            total += v.getTotal();
        }

        rv += "\nTOTAL: " + total;

        JOptionPane.showMessageDialog(null, rv);
    }

    // d. Ocupación
    public static void ocupacion(Gestioestante inv){

        int libres = 0;
        int ocupados = 0;

        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] == null){
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

    // e. Buscar por título
    public static void buscar(Gestioestante inv, String titulo){

        String texto = "";

        for(int e=0; e<inv.estantes.length; e++){
            for(int f=0; f<inv.estantes[e].length; f++){
                for(int c=0; c<inv.estantes[e][f].length; c++){

                    if(inv.estantes[e][f][c] != null){

                        if(inv.estantes[e][f][c].getTitulo().equalsIgnoreCase(titulo)){
                            texto += "("+e+","+f+","+c+")\n";
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
