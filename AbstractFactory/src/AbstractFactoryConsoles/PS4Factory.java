/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryConsoles;

/**
 *
 * @author Emanuel
 */
public class PS4Factory extends VideoGameFactory {

    public Console montarConsole() {
        return new ConsolePS4();
    }

    public Controle montarControle() {
        return new ControleDualshock4();
    }
    
    
    
}
