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

        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] != null){
                        invencomple += inv.estantes[estante][fila][columna].getTitulo() +
                                 " (Estante " + estante +
                                 ", Fila " + fila +
                                 ", Columna " + columna + ")\n";
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, invencomple);
    }

    // b. Espacios vacíos
    public static void vacios(Gestioestante inv){

        String stockvacios = "";

        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] == null){
                        stockvacios += "(Estante " + estante +
                                        ", Fila " + fila +
                                        ", Columna " + columna + ")\n";
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

        for(int estante = 0; estante < inv.estantes.length; estante++){
            for(int fila = 0; fila < inv.estantes[estante].length; fila++){
                for(int columna = 0; columna < inv.estantes[estante][fila].length; columna++){

                    if(inv.estantes[estante][fila][columna] == null){
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
                        }
                    }
                }
            }
        }

        if(texto.equals("")){
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        } else {
            JOptionPane.showMessageDialog(null, texto);
        }
    }
}