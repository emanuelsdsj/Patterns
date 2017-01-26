
package fabricagaragemcomum;

import interfaces.ICreator;
import interfaces.IGaragem;

public class FabricaGaragemComum implements ICreator {

    @Override
    public IGaragem createGaragem() {
        return new GaragemComum();
    }

}
