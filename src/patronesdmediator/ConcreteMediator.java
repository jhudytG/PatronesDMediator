/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdmediator;

/**
 *
 * @author jhudy
 */
public class ConcreteMediator implements Mediator{

    private ConcreteColleague1 usu1;
    private ConcreteColleague2 usu2;

    public void setUsu1(ConcreteColleague1 usu1) {
        this.usu1 = usu1;
    }

    public void setUsu2(ConcreteColleague2 usu2) {
        this.usu2 = usu2;
    }
    
    
    @Override
    public void send(String mensaje, Colleague colega) {
        if(colega == usu1){
            usu2.mensajeRecibido(mensaje);
        }else{
            if(colega == usu2){
                usu1.mensajeRecibido(mensaje);
            }
        }
    }
    
}
