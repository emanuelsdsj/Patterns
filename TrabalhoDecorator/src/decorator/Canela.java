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
public class Canela extends Decorator implements IComponent {

    public Canela(IComponent decorated) {
        super(decorated);
    }

    @Override
    public String fazer() {
        return "Colocando canela" + " " + this.decorated.fazer();
    }
    
}
