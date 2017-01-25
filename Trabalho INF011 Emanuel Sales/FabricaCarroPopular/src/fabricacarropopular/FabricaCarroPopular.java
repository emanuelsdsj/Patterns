/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricacarropopular;

import interfaces.IAbstractFactory;
import interfaces.IMotor;
import interfaces.IRoda;
import interfaces.ISom;

/**
 *
 * @author aluno
 */
public class FabricaCarroPopular implements IAbstractFactory{

    @Override
    public IRoda createRoda() {
        return new RodaFerro();
    }

    @Override
    public IMotor createMotor() {
       return new MotorV6();
    }

    @Override
    public ISom createSom() {
       return new SomCD();
    }
    
    @Override
    public String toString(){
       return "Carro Popular";
    }
    
}
