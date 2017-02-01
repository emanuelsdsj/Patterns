/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetosolar;

import interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class TetoSolar implements IPrototype {

    @Override
    public IPrototype clone() {
        return new TetoSolar();
    }

    public String exibirInfo() {
        return "Possui Teto Solar";
    }
    
    public String toString() {
        return "TetoSolar";
    }
    
}
