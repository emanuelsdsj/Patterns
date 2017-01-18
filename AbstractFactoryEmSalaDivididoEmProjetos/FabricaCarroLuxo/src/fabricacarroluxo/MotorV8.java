/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricacarroluxo;

import interfaces.IMotor;

/**
 *
 * @author aluno
 */
public class MotorV8 implements IMotor{

    @Override
    public String ligar() {
        return "Ligando motor de carro de luxo";
    }
    
}
