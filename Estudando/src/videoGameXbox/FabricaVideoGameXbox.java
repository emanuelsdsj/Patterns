/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoGameXbox;

import Interfaces.IConsole;
import Interfaces.IControle;
import Interfaces.IAbstractFactory;

/**
 *
 * @author aluno
 */
public class FabricaVideoGameXbox implements IAbstractFactory {
    private static FabricaVideoGameXbox instance;
    
    private FabricaVideoGameXbox() {
        
    }
    
    public static FabricaVideoGameXbox getInstance() {
        if(instance == null)
            instance = new FabricaVideoGameXbox();
        return instance;
    }

    @Override
    public IConsole createConsole() {
        return new ConsoleXbox();
    }

    @Override
    public IControle createControle() {
        return new BlackPiano();
    }   
}
