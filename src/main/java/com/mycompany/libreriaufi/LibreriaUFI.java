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
<<<<<<< HEAD
        
      Gestioestante inventario = new Gestioestante();
        Ventas ventas = new Ventas();

        int opcion = 0;
        
        // Libros fijos 
            Libro l1 = new Libro("123", "El cadejos", "Costarriqueñismos", "Leyenda", 4, 12000, null);
            inventario.libroguardado(0, 0, 0, l1);

            Libro l2 = new Libro("122", "Harry Potter y la piedra filosofal", "JK Rowling", "Fantasia", 3, 15000, null);
            inventario.libroguardado(0, 0, 1, l2);
=======
        
      Gestioestante inventario = new Gestioestante();
        Ventas ventas = new Ventas();

        int opcion = 0;
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a

        do {

            String input = (JOptionPane.showInputDialog(null,
                    
              
                "MENU\n" +
                "1. Agregar libro\n" +
                "2. Mostrar mapa estante\n" +
                "3. Vender libro\n" +
                "4. Ver inventario\n" +
<<<<<<< HEAD
                "5. Reporte ventas\n" +
                "6. Ocupacion\n" +
                "7. Buscar libro\n" +
=======
                "5. Espacios vacios\n" +
                "6. Reporte ventas\n" +
                "7. Ocupacion\n" +
                "8. Buscar libro\n" +
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
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
<<<<<<< HEAD
                String codigo = JOptionPane.showInputDialog("Codigo:");
                    if (codigo == null) break;

                String titulo = JOptionPane.showInputDialog("Titulo:");
                     if (titulo == null) break;

                 String autor = JOptionPane.showInputDialog("Autor:");
                     if (autor == null) break;

                String categoria = JOptionPane.showInputDialog("Categoria:");
                    if (categoria == null) break;

                 String cantStr = JOptionPane.showInputDialog("Cantidad:");
                    if (cantStr == null || !cantStr.matches("\\d+")) {
                      JOptionPane.showMessageDialog(null, "Cantidad inválida");
                         break;
                         
                     }
                    
                        int cantidad = Integer.parseInt(cantStr);

                 String precioStr = JOptionPane.showInputDialog("Precio:");
                     if (precioStr == null || !precioStr.matches("\\d+(\\.\\d+)?")) {
                          JOptionPane.showMessageDialog(null, "Precio inválido");
                             break;
                        }
                    double precio = Double.parseDouble(precioStr);

                  String estanteStr = JOptionPane.showInputDialog("Estante:");
                  String filaStr = JOptionPane.showInputDialog("Fila:");
                  String columnaStr = JOptionPane.showInputDialog("Columna:");

                        if (estanteStr == null || filaStr == null || columnaStr == null ||
                        !estanteStr.matches("\\d+") || !filaStr.matches("\\d+") || !columnaStr.matches("\\d+")) {
                         JOptionPane.showMessageDialog(null, "Ubicación inválida");
                        break;
                        }

                        int estante = Integer.parseInt(estanteStr);
                        int fila = Integer.parseInt(filaStr);
                        int columna = Integer.parseInt(columnaStr);

                        Libro libro = new Libro(codigo, titulo, autor, categoria, cantidad, precio, null);

                        inventario.libroguardado(estante, fila, columna, libro);

                        JOptionPane.showMessageDialog(null, inventario.mapaestante(estante));
                        break;
                case 2:
                    // Mostrar mapa
                    String estStr = JOptionPane.showInputDialog("Numero de estante:");
                    if (estStr == null || !estStr.matches("\\d+")) {
                        JOptionPane.showMessageDialog(null, "Dato inválido");
                        break;
                    }
                    int est = Integer.parseInt(estStr);

=======
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
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                    JOptionPane.showMessageDialog(null, inventario.mapaestante(est));
                    break;

                case 3:
<<<<<<< HEAD
                    // Vender libro por código o nombre
                    String dato = JOptionPane.showInputDialog("Ingrese codigo o nombre del libro:");
                    if (dato == null) break;

                    String cantVentaStr = JOptionPane.showInputDialog("Cantidad a vender:");
                    if (cantVentaStr == null || !cantVentaStr.matches("\\d+")) {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida");
                        break;
                    }

                    int cantidadV = Integer.parseInt(cantVentaStr);

                    ventas.venderPorDato(inventario, dato, cantidadV);
=======
                    e = Integer.parseInt(JOptionPane.showInputDialog("Estante:"));
                    f = Integer.parseInt(JOptionPane.showInputDialog("Fila:"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Columna:"));

                    ventas.venderL(inventario, e, f, c);
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
                    break;

                case 4:
                    Reporte.inventario(inventario);
                    break;

                case 5:
<<<<<<< HEAD
=======
                    Reporte.vacios(inventario);
                    break;

                case 6:
>>>>>>> d826979a59f07411889dc3039bcf51ed9a6f291a
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
