/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdmediator;

/**
 *
 * @author jhudy
 */
public abstract class Colleague {

    protected Mediator mediador;

    public Colleague(Mediator mediador) {
        this.mediador = mediador;
    }

    public abstract void send(String mensaje);

    public abstract void mensajeRecibido(String mensaje);
}
