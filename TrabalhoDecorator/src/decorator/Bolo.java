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
public class Bolo implements IComponent {

    @Override
    public String fazer() {
        return "Fazendo bolo";
    }
    
}
