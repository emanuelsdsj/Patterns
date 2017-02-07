/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoGamePS4;

import Interfaces.IControle;

/**
 *
 * @author aluno
 */
public class DualShock4 implements IControle {

    @Override
    public void Controlar() {
        System.out.println("Controlando ps4 com dualshock4");
    }
    
}
