/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdmediator;

/**
 *
 * @author jhudy
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediador) {
        super(mediador);
    }

    @Override
    public void send(String mensaje) {
        mediador.send(mensaje, this);
    }

    @Override
    public void mensajeRecibido(String mensaje) {
        System.out.println("Colega 2 recibe el mensaje: " + mensaje);
    }

}
