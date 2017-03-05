/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author emanuelssj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IComponent triangle = new Triangle();
        IComponent triangle2 = new Triangle();
        IComponent rectangle = new Rectangle();
        IComponent rectangle2 = new Rectangle();
        Component component = new Component();
        
        component.addComponent(rectangle);
        component.addComponent(triangle);
        component.girar();
        
        System.out.println("\n");
        
        component.addComponent(rectangle2);
        component.addComponent(triangle2);
        component.girar();
    }
    
}
