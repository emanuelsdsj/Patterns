/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypes;

import Interfaces.IConsole;
import Interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class ConsoleNintendoWii implements IConsole, IPrototype {
    private String videogame = "PS2";

    public ConsoleNintendoWii(String videogame) {
        this.videogame = videogame;
    }

    @Override
    public void Ligar() {
        System.out.println("Ligando " + videogame + " com o console NintendoWii");
    }

    @Override
    public IPrototype clone() {
        return new ConsoleNintendoWii(this.videogame);
    }   
    
    public String toString() {
        return "ConsoleNintendoWii";
    }
}
