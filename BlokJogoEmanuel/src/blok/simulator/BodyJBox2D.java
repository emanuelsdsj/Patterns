/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.simulator;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.World;

/**
 *
 * @author Emanuel
 */
public class BodyJBox2D extends Body implements IBody {
    
    public BodyJBox2D(BodyDef bd, World world) {
        super(bd, world);
    }

    @Override
    public final float[] getPosition_() {
        Vec2 vec = this.getPosition();
        float[] position = new float[2];
        position[0] = vec.x;
        position[1] = vec.y;
        return position;
    }  

    @Override
    public void setUserData_(String player) {
        this.setUserData(player);
    }
}
