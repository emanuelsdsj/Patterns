
package main;

import gui.FabricaMainGui;
import interfaces.IAbstractFactory;

public class Main {

    public String usarFabrica(IAbstractFactory factory) {
        return factory.createMotor().ligar() + "\n" + factory.createRoda().alinhar() + "\n" + factory.createSom().tocar();
    }
    
    public static void main(String[] args) {
        FabricaMainGui fbg = new FabricaMainGui();
        fbg.setVisible(true);
   }
}
