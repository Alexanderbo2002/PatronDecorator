/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrondecorator;

/**
 *
 * @author Alexander
 */
public class PatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un café simple
        Bebida bebida = new Cafe();
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Agregar leche al café
        bebida = new LecheDecorator(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Agregar azúcar al café
        bebida = new AzucarDecorator(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());
    }
    
}
