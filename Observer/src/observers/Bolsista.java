/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import subjects.Subject;

/**
 *
 * @author emanuelssj
 */
public class Bolsista implements IObserver {

    @Override
    public void update(Subject subject, String mensagem) {
        System.out.println(subject.toString() + " enviou: " + mensagem + " para " + toString());
    }
    
    public String toString() {
        return "Bolsista";
    }
}
