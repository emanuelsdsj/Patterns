
package fabricagaragemcomum;

import interfaces.ICreator;
import interfaces.IGaragem;

public class FabricaGaragemComum implements ICreator {
    private static FabricaGaragemComum instance;
    
    private FabricaGaragemComum() {
        
    }
    
    public static FabricaGaragemComum getInstance() {
        if(instance == null) 
            instance = new FabricaGaragemComum();
        return instance;
    }
    
    @Override
    public IGaragem createGaragem() {
        return new GaragemComum();
    }

}
