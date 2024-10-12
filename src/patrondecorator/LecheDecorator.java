/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorator;

/**
 *
 * @author Alexander
 */
public class LecheDecorator extends BebidaDecorator {

    public LecheDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.50;
    }
}
