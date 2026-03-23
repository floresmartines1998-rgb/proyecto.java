/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.libreriaufi;
import javax.swing.JOptionPane;
/**
 *
 * @author H
 */
public class LibreriaUFI {

    //prueba de subida en gib
    
    public static void main(String[] args) {
        
      Gestioestante inventario = new Gestioestante();
        Ventas ventas = new Ventas();

        int opcion = 0;

        do {

            String input = (JOptionPane.showInputDialog(null,
                    
              
                "MENU\n" +
                "1. Agregar libro\n" +
                "2. Mostrar mapa estante\n" +
                "3. Vender libro\n" +
                "4. Ver inventario\n" +
                "5. Espacios vacios\n" +
                "6. Reporte ventas\n" +
                "7. Ocupacion\n" +
                "8. Buscar libro\n" +
                "0. Salir" ));
          
            // se raliza para envitar  que el codigo se quiebre a la hora de finalizar el programa 
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");  
                break;
            }  
            try {
                opcion = Integer.parseInt(input);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: ingrese un número válido");
                continue; // vuelve al menu 
            }
            
            
            switch (opcion) {

                case 1:
                    String codigo = JOptionPane.showInputDialog("Codigo:");
                    String titulo = JOptionPane.showInputDialog("Titulo:");
                    String autor = JOptionPane.showInputDialog("Autor:");
                    String categoria = JOptionPane.showInputDialog("Categoria:");
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));

                    int e = Integer.parseInt(JOptionPane.showInputDialog("Estante:"));
                    int f = Integer.parseInt(JOptionPane.showInputDialog("Fila:"));
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Columna:"));

                    Libro libro = new Libro(codigo, titulo, autor, categoria, cantidad, precio, null);

                    inventario.libroguardado(e, f, c, libro);
                    break;

                case 2:
                    int est = Integer.parseInt(JOptionPane.showInputDialog("Numero de estante:"));
                    JOptionPane.showMessageDialog(null, inventario.mapaestante(est));
                    break;

                case 3:
                    e = Integer.parseInt(JOptionPane.showInputDialog("Estante:"));
                    f = Integer.parseInt(JOptionPane.showInputDialog("Fila:"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Columna:"));

                    ventas.venderL(inventario, e, f, c);
                    break;

                case 4:
                    Reporte.inventario(inventario);
                    break;

                case 5:
                    Reporte.vacios(inventario);
                    break;

                case 6:
                    Reporte.Repventas();
                    break;

                case 7:
                    Reporte.ocupacion(inventario);
                    break;

                case 8:
                    String buscar = JOptionPane.showInputDialog("Titulo a buscar:");
                    Reporte.buscar(inventario, buscar);
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }

        } while (opcion != 0);
  
        
    }
}
