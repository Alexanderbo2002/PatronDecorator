/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorator;

/**
 *
 * @author Alexander
 */
public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion();
    }

    @Override
    public double costo() {
        return bebida.costo();
    }
}
