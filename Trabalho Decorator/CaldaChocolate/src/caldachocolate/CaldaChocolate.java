/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldachocolate;

import decorator.Decorator;
import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public class CaldaChocolate extends Decorator implements IComponent{

    public CaldaChocolate(IComponent decorated) {
        super(decorated);
    }
    
    public CaldaChocolate() {
    }

    @Override
    public String fazer() { 
        return this.decorated.fazer() + " " + "Colocando calda de chocolate";
    }
    
}
