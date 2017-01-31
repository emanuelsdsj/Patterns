/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrovisor;

import interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class Retrovisor implements IPrototype {

    @Override
    public IPrototype clone() {
        return new Retrovisor();
    }
    
    public String exibirInfo() {
        return "Possui retrovisor";
    }
 
}
