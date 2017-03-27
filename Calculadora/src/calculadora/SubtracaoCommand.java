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
public class SubtracaoCommand implements ICommand {
     private Calculadora receiver;
    private double numero;
    
    public SubtracaoCommand(double numero, Calculadora receiver) {
        this.numero = numero;
        this.receiver = receiver;
    }

    @Override
    public void redo() {
        receiver.setNumero(receiver.getNumero()-numero);
    }

    @Override
    public void undo() {
        receiver.setNumero(receiver.getNumero()+numero);
    } 
}
