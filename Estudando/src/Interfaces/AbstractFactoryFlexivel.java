/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class AbstractFactoryFlexivel {
    private Map<String, IPrototype> prototypes = new HashMap<String, IPrototype>();
    
    public IPrototype createPrototype(String key) {
        return prototypes.get(key).clone();
    }
    
    public boolean addPrototype(String key, IPrototype value) {
        return prototypes.put(key, value) != null;
    }
    
    public boolean removePrototype(String key) {
        return prototypes.remove(key) != null;
    }
}
