package blok.simulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public interface ISimulator {
    public void init();
    public void removeBody(Object body);
    public void run();
    public void stop();
    public void start();
}
