/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import blok.simulator.ISimulator;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class GameAbstract extends javax.swing.JPanel {
    protected ISimulator m_simulator;
    public enum State {INITIAL, RUNNING, YOUWON, YOULOST};
    protected State m_state = State.INITIAL;
    
    public abstract void bodiesCreated(ArrayList<Point2D> bodies); 
    public abstract void setState(State state);
    public abstract void bodiesUpdated(ArrayList<Point2D> bodies);
    
    public void setSimulator(ISimulator simulator) {
        m_simulator = simulator;
    }
}
