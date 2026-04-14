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
<<<<<<< HEAD
public class Ventas {
=======
public class Ventas {    //verificar si se agrega factura y fecha y hora 
    public static ArrayList<Ventas> historial = new ArrayList<>();
    private Libro Libro;
    public int cantidadlibro;   
    public double total;
    
    
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a

    public static ArrayList<Ventas> historial = new ArrayList<>();
    private Libro libro;
    private int cantidadlibro;
    private double total;

<<<<<<< HEAD
    public Ventas() {}

    public Ventas(Libro libro, int cantidadlibro) {
        this.libro = libro;
        this.cantidadlibro = cantidadlibro;
        this.total = libro.getPrecio() * cantidadlibro;
    }

    public Libro getLibro() {
        return libro;
=======
    public Ventas(Libro Libro, int cantidadlibro) {
        this.Libro = Libro;
        this.cantidadlibro = cantidadlibro;
        this.total = Libro.getPrecio()  * cantidadlibro;
        
    }

    public Libro getLibro() {
        return Libro;
    }

    public void setLibro(Libro Libro) {
        this.Libro = Libro;
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
    }

    public int getCantidadlibro() {
        return cantidadlibro;
    }

<<<<<<< HEAD
=======
    public void setCantidadlibro(int cantidadlibro) {
        this.cantidadlibro = cantidadlibro;
    }

>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
    public double getTotal() {
        return total;
    }

<<<<<<< HEAD
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
=======
    public void setTotal(double total) {
        this.total = total;
    }
    
    //metodo de calculo y funcionalidad de la  venta 
    
    public void venderL(Gestioestante inventario, int e, int f, int c){
        try {
            
            if(inventario.estantes[e][f][c] != null){
                
            
                Libro libro1 = inventario.estantes[e][f][c];
                
                //Registrar la venta de uno o más libros.
                Ventas venta = new Ventas(libro1, 1);
                
                //guardar en HIstorial
                historial.add(venta);
                
                // actualizacion
                inventario.estantes[e][f][c] = null;
                
                JOptionPane.showMessageDialog(null,"libro vendido" + libro1.getTitulo() + "\nTotal: " + venta.getTotal());
            }else{
                JOptionPane.showMessageDialog(null, "no hay libro");
            } 
   
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "erro");   
        }
    }
    
    
    
    
    
    

        
        
    
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
}
