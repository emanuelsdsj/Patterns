/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroLuxo;

import interfaces.IAbstractFactory;
import interfaces.IMotor;
import interfaces.IRoda;
import interfaces.ISom;

/**
 *
 * @author aluno
 */
public class FabricaCarroLuxo implements IAbstractFactory{

    @Override
    public IRoda createRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public IMotor createMotor() {
        return new MotorV8();
    }

    @Override
    public ISom createSom() {
        return new SomMultimidia();
    }
    
}
