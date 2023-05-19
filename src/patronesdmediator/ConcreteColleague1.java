/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdmediator;

/**
 *
 * @author jhudy
 */
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediador) {
        super(mediador);
    }

    @Override
    public void send(String mensaje) {
        mediador.send(mensaje, this);
    }

    @Override
    public void mensajeRecibido(String mensaje) {
        System.out.println("Colega 1 recibe el mensaje: "+mensaje);
    }
    
}
