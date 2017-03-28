/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanuelssj
 */
public class Composite implements IComponent {
    public List<IComponent> componentes = new ArrayList<IComponent>();

    @Override
    public void girar() {
        for(IComponent component : componentes)
            component.girar();
    }

    @Override
    public void adicionar(IComponent component) {
        componentes.add(component);
    }
    
    @Override
    public void remover(IComponent component) {
        componentes.remove(component);
    }
}
