/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Emanuel
 */
public class AbstractFactoryFlexível {
    private Map<String, IPrototype> prototypes = new HashMap<String, IPrototype>();
    
    public Object create(String key) {
        return prototypes.get(key);
    }
    
    public boolean addPrototypes(String key, IPrototype prototype) {
        return prototypes.put(key, prototype) == null;
    }
    
    public boolean remove(String key) {
        return prototypes.remove(key) == null;
    }
    
}
