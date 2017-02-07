/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoGamePS4;

import Interfaces.IConsole;
import Interfaces.IControle;
import Interfaces.IAbstractFactory;

/**
 *
 * @author aluno
 */
public class FabricaVideoGamePS4 implements IAbstractFactory{

    private static FabricaVideoGamePS4 instance;
    
    private FabricaVideoGamePS4() {
        
    }
    
    public static FabricaVideoGamePS4 getInstance() {
        if(instance == null)
            instance = new FabricaVideoGamePS4();
        return instance;
    }
    
    @Override
    public IConsole createConsole() {
        return new ConsolePS4();
    }

    @Override
    public IControle createControle() {
        return new DualShock4();
    }  
}
