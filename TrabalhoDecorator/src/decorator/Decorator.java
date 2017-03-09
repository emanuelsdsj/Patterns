/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import Interfaces.IComponent;

/**
 *
 * @author aluno
 */
public abstract class Decorator implements IComponent {
    protected IComponent decorated;
    
    public Decorator(IComponent decorated) {
        this.setDecorated(decorated);     
    }
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
}
