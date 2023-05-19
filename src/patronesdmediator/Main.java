/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdmediator;

/**
 *
 * @author jhudy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteMediator mediator = new ConcreteMediator();
        
        ConcreteColleague1 colega1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colega2 = new ConcreteColleague2(mediator);
        
        mediator.setUsu1(colega1);
        mediator.setUsu2(colega2);
        
        colega1.send("Hola, ¿qué tal?");
        colega2.send("bien, deseando las vaciones");
    }
    
}
