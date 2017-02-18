/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.simulator;

import org.jbox2d.common.Vec2;

/**
 *
 * @author Emanuel
 */
public class Vec2JBox2D extends Vec2 implements IVec{

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
    
}
