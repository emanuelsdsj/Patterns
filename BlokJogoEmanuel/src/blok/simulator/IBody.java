/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.simulator;

/**
 *
 * @author Emanuel
 */
public interface IBody {
   
    public float[] getPosition_();
    public Object getUserData();

    public void setUserData_(String player);
}
