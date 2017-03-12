/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import interfaces.IComponent;
import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public abstract class Decorator implements IComponent {
    protected IComponent decorated;
    
    public Decorator(IComponent decorated) {
        this.setDecorated(decorated);     
    }
    
    public Decorator() {
             
    }
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
}
