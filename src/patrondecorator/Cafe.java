/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorator;

/**
 *
 * @author Alexander
 */
public class Cafe implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Café";
    }

    @Override
    public double costo() {
        return 1.50;
    }
}

