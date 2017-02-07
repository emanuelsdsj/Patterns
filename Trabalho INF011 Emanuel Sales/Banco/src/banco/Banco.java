/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class Banco implements IPrototype {
    
    @Override
    public IPrototype clone() {
        return new Banco();
    }
    
    public String exibirInfo() {
        return "Possui banco";
    }
    
    public String toString() {
        return "Banco";
    }
}
