/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author emanuelssj
 */
public abstract class Decorator implements IComponent {
    protected IComponent decorator;
    protected boolean isAfter;

    public void setDecorator(IComponent decorator) {
        this.decorator = decorator;
        this.isAfter = isAfter;
    }    
    
}
