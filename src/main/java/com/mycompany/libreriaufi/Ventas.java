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
public class Ventas {    //verificar si se agrega factura y fecha y hora 
    public static ArrayList<Ventas> historial = new ArrayList<>();
    private Libro Libro;
    public int cantidadlibro;   
    public double total;
    
    

    public Ventas() {
        
    }

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
    }

    public int getCantidadlibro() {
        return cantidadlibro;
    }

    public void setCantidadlibro(int cantidadlibro) {
        this.cantidadlibro = cantidadlibro;
    }

    public double getTotal() {
        return total;
    }

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
    
    
    
    
    
    

        
        
    
}
