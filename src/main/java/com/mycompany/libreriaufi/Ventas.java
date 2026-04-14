/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriaufi;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author H
 */
public class Ventas {

    public static ArrayList<Ventas> historial = new ArrayList<>();
    private Libro libro;
    private int cantidadlibro;
    private double total;

    public Ventas() {}

    public Ventas(Libro libro, int cantidadlibro) {
        this.libro = libro;
        this.cantidadlibro = cantidadlibro;
        this.total = libro.getPrecio() * cantidadlibro;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidadlibro() {
        return cantidadlibro;
    }

    public double getTotal() {
        return total;
    }

    // MÉTODO PRINCIPAL (el que sí usas)
    public void venderPorDato(Gestioestante inventario, String dato, int cantidad) {

        for (int estante = 0; estante < inventario.estantes.length; estante++) {
            for (int fila = 0; fila < inventario.estantes[estante].length; fila++) {
                for (int columna = 0; columna < inventario.estantes[estante][fila].length; columna++) {

                    Libro libro1 = inventario.estantes[estante][fila][columna];

                    if (libro1 != null &&
                       (libro1.getCodigo().equalsIgnoreCase(dato) ||
                        libro1.getTitulo().equalsIgnoreCase(dato))) {

                        if (libro1.getCantidad() >= cantidad) {

                            Ventas venta = new Ventas(libro1, cantidad);
                            historial.add(venta);

                            libro1.setCantidad(libro1.getCantidad() - cantidad);

                            JOptionPane.showMessageDialog(null,
                                "Venta realizada\n" +
                                "Libro: " + libro1.getTitulo() + "\n" +
                                "Ubicación: Estante " + estante +
                                ", Fila " + fila +
                                ", Columna " + columna + "\n" +
                                "Stock restante: " + libro1.getCantidad() +
                                "\nTotal: " + venta.getTotal());

                        } else {
                            JOptionPane.showMessageDialog(null, "No hay suficiente stock");
                        }

                        return;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }
}
