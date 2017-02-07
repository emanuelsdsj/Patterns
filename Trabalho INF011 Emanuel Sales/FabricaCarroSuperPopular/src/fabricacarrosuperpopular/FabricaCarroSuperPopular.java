
package fabricacarrosuperpopular;

import interfaces.IAbstractFactory;
import interfaces.IMotor;
import interfaces.IRoda;
import interfaces.ISom;

public class FabricaCarroSuperPopular implements IAbstractFactory{
    private static FabricaCarroSuperPopular instance;
    
    private FabricaCarroSuperPopular() {
        
    }
    
    public static FabricaCarroSuperPopular getInstance() {
        if(instance == null) 
            instance = new FabricaCarroSuperPopular();
        return instance;
    }
    
    @Override
    public IRoda createRoda() {
        return new RodaMadeira();
    }

    @Override
    public IMotor createMotor() {
       return new MotorV4();
    }

    @Override
    public ISom createSom() {
        return new SomDisquete();
    }
    
    @Override
    public String toString(){
        return "Carro Super Popular";
    }
    
}
