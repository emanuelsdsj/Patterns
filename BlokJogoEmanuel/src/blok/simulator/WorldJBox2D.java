/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.simulator;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.World;

/**
 *
 * @author Emanuel
 */
public class WorldJBox2D extends World {

    public WorldJBox2D(Vec2 gravity) {
        super(gravity);
    }
   
    
    public BodyJBox2D createBodyJBox2D(BodyDef def) { 
    assert (isLocked() == false);
    if (isLocked()) {
      return null;
    }
    // TODO djm pooling
    BodyJBox2D b = new BodyJBox2D(def, this);
    
    // add to world doubly linked list
    b.m_prev = null;
    b.m_next = m_bodyList;
    if (m_bodyList != null) {
      m_bodyList.m_prev = b;
    }
    m_bodyList = b;
    ++m_bodyCount;

    return b;
  }   
}
