
package fabricagaragempredio;

import interfaces.ICreator;
import interfaces.IGaragem;

public class FabricaGaragemPredio implements ICreator{
    private static FabricaGaragemPredio instance;
    
    private FabricaGaragemPredio() {
        
    }
    
    public static FabricaGaragemPredio getInstance() {
        if(instance == null) 
            instance = new FabricaGaragemPredio();
        return instance;
    }
    
    @Override
    public IGaragem createGaragem() {
        return new GaragemPredio();
    }

}
