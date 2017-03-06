package blok.simulator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import blok.gui.MainPanel;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jbox2d.callbacks.ContactImpulse;
import org.jbox2d.callbacks.ContactListener;
import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.*;
import org.jbox2d.dynamics.contacts.Contact;

/**
 *
 * @author sandroandrade
 */
public class AdapterJBox2D implements Runnable, ContactListener, ISimulator {

    public AdapterJBox2D(MainPanel mainPanel) {
        m_mainPanel = mainPanel;
    }
    
    public void start() {
        m_schedulerHandle = m_scheduler.scheduleAtFixedRate(this, 0, 3, TimeUnit.MILLISECONDS);
    }

    public void stop() {
        m_schedulerHandle.cancel(true);
    }

    @Override
    public void run() {

                m_world.step(B2_TIMESTEP, B2_VELOCITY_ITERATIONS, B2_POSITION_ITERATIONS);
//        //if(m_bodies.size() == points.size() && m_bodies.size() != 0 && points.size() != 0) {
            for(int j = 0; j > 0; j++) {
                for(int i = 0; i < m_bodies.size(); i++) {
                   points.get(i).setLocation(m_bodies.get(i).getPosition().x, m_bodies.get(i).getPosition().y);
                   m_mainPanel.bodiesUpdated(points);
//                   if(m_bodies.size() - 1 == i)
//                       m_mainPanel.bodiesUpdated2(points.get(i), "dasds");
//                   else
//                      m_mainPanel.bodiesUpdated2(points.get(i), "");   
                }
            }
//        //}
//        for (Body b = m_world.getBodyList(); b != null; b = b.getNext()) {
//            point.get(i).setLocation(m_bodies.get(i).getPosition().x, m_bodies.get(i).getPosition().y)
//        }
        System.out.println("Size =" + m_world.getBodyCount());
        
    }

    public void init() {
        m_world = new World(new Vec2(0, -10f));
        m_world.setContactListener(this);
        m_bodies.clear();
        points.clear();

        // Ground
        m_ground = createBody(0.0f, -260.0f, 900.0f, 20.0f, false, 1.0f, 0.3f, 0.5f);

        // Blocks
        int i = 0, j = 0;
        for (i = 0; i < 10; ++i) 
            for (j = 0; j < 11 - i; ++j) 
                m_bodies.add(createBody(-150.0f+15*i+30*j, -236.0f+30*i, 28.0f, 28.0f, true, 1.0f, 0.3f, 0.5f));
        
        // Player
        j-=2;
        m_bodies.add(m_player = createBody(-150.0f+15*i+30*j, -236.0f+30*i+14, 56.0f, 56.0f, true, 1.0f, 0.3f, 0.5f));
        m_player.setUserData("player");
             
        for(i = 0; i < m_bodies.size(); i++) {
            points.add(new Point2D.Double(m_bodies.get(i).getPosition().x, m_bodies.get(i).getPosition().y));
            pointFind.put(m_bodies.get(i), points.get(i));
            bodyFind.put(points.get(i), m_bodies.get(i));
        }  
        m_mainPanel.bodiesCreated(points);
    }

    private Body createBody(float x, float y, float width, float height, boolean dynamic, float density, float friction, float restitution) {
        BodyDef bodyDef = new BodyDef();
        if (dynamic)
            bodyDef.type = BodyType.DYNAMIC;
        bodyDef.position.set(x, y);
        Body body =  m_world.createBody(bodyDef);
        PolygonShape box = new PolygonShape();
        box.setAsBox(width/2, height/2);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = box;
        fixtureDef.density = density;
        fixtureDef.friction = friction;
        fixtureDef.restitution = restitution;
        body.createFixture(fixtureDef);
        body.setSleepingAllowed(true);
        
        return body;
    }
    
    @Override
    public void removeBody(Point2D bodyPoint) {
        BodyDef def = new BodyDef();
        Vec2 vec2 = new Vec2();
        vec2.set(Float.parseFloat(Double.toString(bodyPoint.getX())), Float.parseFloat(Double.toString(bodyPoint.getY())));
        def.position = vec2;
        Body body = new Body(def, m_world);
        System.out.println( vec2.x  + "   " + vec2.y +   " / " + body.getPosition().x + "   " + body.getPosition().y);
        
        
        for(int i = 0 ; i< points.size();i++) {
            if(bodyPoint.getX() == points.get(i).getX() && bodyPoint.getY() == points.get(i).getY()) {
                points.remove(bodyPoint);
                m_world.destroyBody(bodyFind.get(bodyPoint));
                m_bodies.remove(bodyFind.get(bodyPoint));
                break;
            }
        }
        
        //for(int i = 0 ; i< m_bodies.size();i++) {
        //   if(bodyPoint.getX() == m_bodies.get(i).getPosition().x && bodyPoint.getY() == m_bodies.get(i).getPosition().y) {
                 
        //        break;
        //   }
        //}
        if (points.size() == 2)
        {
            stop();
            m_mainPanel.setState(MainPanel.State.YOUWON);
        }
    }

    @Override
    public void beginContact(Contact contact) {
        if ((contact.getFixtureA().getBody() == m_ground && contact.getFixtureB().getBody() == m_player) ||
            (contact.getFixtureB().getBody() == m_ground && contact.getFixtureA().getBody() == m_player))
        {
            stop();
            m_mainPanel.setState(MainPanel.State.YOULOST);
        }
    }

    @Override
    public void endContact(Contact cntct) {
    }

    @Override
    public void preSolve(Contact cntct, Manifold mnfld) {
    }

    @Override
    public void postSolve(Contact cntct, ContactImpulse ci) {
    }

    private static float PI = 3.14159265359f;
    private static float B2_TIMESTEP = 1.0f / 30.0f;
    private static int B2_VELOCITY_ITERATIONS = 8;
    private static int B2_POSITION_ITERATIONS = 4;

    private MainPanel m_mainPanel;
    
    private final ScheduledExecutorService m_scheduler = Executors.newScheduledThreadPool(1);
    private ScheduledFuture<?> m_schedulerHandle = null;
            
    private static World m_world;
    private ArrayList<Body> m_bodies = new ArrayList<Body>();
    private Body m_player = null;
    private Body m_ground = null;
    private ArrayList<Point2D> points = new ArrayList<Point2D>();
    private Map<Body, Point2D> pointFind = new HashMap<Body, Point2D>();
    private Map<Point2D, Body> bodyFind = new HashMap<Point2D, Body>();
    
}
