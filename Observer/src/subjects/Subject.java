/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subjects;

import java.util.ArrayList;
import observers.IObserver;

/**
 *
 * @author emanuelssj
 */
public abstract class Subject {
    protected ArrayList<IObserver> observers;
    
    public Subject() {
        observers = new ArrayList<IObserver>();
    }
    
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    
    public abstract void notifyObservers();
}
