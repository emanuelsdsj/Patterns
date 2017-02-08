/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlexibleFactory;

import Interfaces.IPrototype;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class FlexibleFactory {
    private Map<String, IPrototype> prototypes = new HashMap<String, IPrototype>();
    
    public IPrototype createPrototype(String key) {
        IPrototype prototype = prototypes.get(key);
        if(prototype != null)
            return prototype.clone();
        return null;
    }
    
    public boolean addPrototype(String key, IPrototype value) {
        return prototypes.put(key, value) != null;
    }
    
    public boolean removePrototype(String key) {
        return prototypes.remove(key) != null;
    }
}
