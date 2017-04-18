/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subjects;

import observers.IObserver;

/**
 *
 * @author emanuelssj
 */
public class Professor extends Subject {
    private String mensagem;
    private String nome;
    
    public Professor(String nome) {
        this.nome = nome;
    }
    
    public void enviarMensagem(String mensagem) {
        this.mensagem = mensagem;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers)
            observer.update(this, mensagem);
    }
    
    public String toString() {
        return nome;
    }
   
}
