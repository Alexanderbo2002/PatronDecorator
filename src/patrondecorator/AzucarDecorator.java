/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorator;

/**
 *
 * @author Alexander
 */
public class AzucarDecorator extends BebidaDecorator {

    public AzucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Azúcar";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.20;
    }
}
