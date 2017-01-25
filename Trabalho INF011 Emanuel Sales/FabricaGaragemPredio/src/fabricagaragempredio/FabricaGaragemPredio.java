
package fabricagaragempredio;

import interfaces.ICreator;
import interfaces.IGaragem;

public class FabricaGaragemPredio implements ICreator{

    @Override
    public IGaragem createGaragem() {
        return new LocalPredio();
    }

}
