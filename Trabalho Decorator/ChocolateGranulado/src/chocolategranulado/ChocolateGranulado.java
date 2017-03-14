/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolategranulado;

import decorator.Decorator;
import interfaces.IComponent;

/**
 *
 * @author aluno
 */
public class ChocolateGranulado extends Decorator implements IComponent {

    public ChocolateGranulado(IComponent decorated) {
        super(decorated);
    }
    
    public ChocolateGranulado() {
        
    }

    @Override
    public String fazer() {
        return this.decorated.fazer() + "Adicionando chocolate granulado \n";
    }
    
}
