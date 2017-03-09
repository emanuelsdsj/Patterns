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
public class CaldaChocolate extends Decorator implements IComponent{

    public CaldaChocolate(IComponent decorated) {
        super(decorated);
    }

    @Override
    public String fazer() { 
        return this.decorated.fazer() + " " + "Colocando calda de chocolate";
    }
    
}
