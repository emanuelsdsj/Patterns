/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import interfaces.ICommand;

/**
 *
 * @author aluno
 */
public class DivisaoCommand implements ICommand {
    private Calculadora2 receiver;
    private double numero;
    
    public DivisaoCommand(double numero, Calculadora2 receiver) {
        this.numero = numero;
        this.receiver = receiver;
    }

    @Override
    public void redo() {
        receiver.setNumero(receiver.getNumero()/numero);
    }

    @Override
    public void undo() {
        receiver.setNumero(receiver.getNumero()*numero);
    }  
    
}
