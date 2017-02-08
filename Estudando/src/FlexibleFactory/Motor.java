/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlexibleFactory;

import Interfaces.IPrototype;

/**
 *
 * @author aluno
 */
public class Motor implements IPrototype {

    @Override
    public IPrototype clone() {
        return new Motor();
    }
    
}
