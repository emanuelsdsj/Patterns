/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypes;

import Interfaces.IControle;
import Interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class DualShock2 implements IPrototype, IControle {
    private String videogame = "PS2";
    
     public DualShock2(String videogame) {
        this.videogame = videogame;
    }
    @Override
    public IPrototype clone() {
        return new DualShock2(this.videogame);
    }

    @Override
    public void Controlar() {
        System.out.println("Controlando " + videogame + " com DualShock2");
    } 
    
    public String toString() {
        return "DualShock2";
    }
}
