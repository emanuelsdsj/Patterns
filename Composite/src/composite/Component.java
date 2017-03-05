/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanuelssj
 */
public class Component implements IComponent {
    private List<IComponent> component = new ArrayList<IComponent>();
    
    public void addComponent(IComponent component) {
        this.component.add(component);
    }
    
    public void removeComponent(IComponent component) {
        this.component.add(component);
    }   

    @Override
    public void girar() {
        for(IComponent c : component) 
            c.girar();
    }
   
    
}
