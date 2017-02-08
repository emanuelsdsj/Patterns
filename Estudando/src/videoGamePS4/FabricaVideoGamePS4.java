/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoGamePS4;

import Interfaces.IConsole;
import Interfaces.IControle;
import Interfaces.IAbstractFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class FabricaVideoGamePS4 implements IAbstractFactory{

    private static FabricaVideoGamePS4[] instance;
    private static int tam;
    private static int contagem = 0;
    
    private FabricaVideoGamePS4() {
   
    }
    
    public static void initialize(int tam) {
        FabricaVideoGamePS4.tam = tam;
        instance = new FabricaVideoGamePS4[tam];
    }
    
    public static FabricaVideoGamePS4 getInstance() {
        if(contagem == tam)
            contagem = 0;
        if(instance[contagem] == null)
            instance[contagem] = new FabricaVideoGamePS4();
        return instance[contagem++];
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
