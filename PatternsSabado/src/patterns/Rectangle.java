/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author aluno
 */
public class Rectangle extends Shape {

    @Override
    public void draw(double x, double y, double w, double h, Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(Color.CYAN);
        Rectangle2D.Double shape = new Rectangle2D.Double(x, y, w, h);
        g2d.draw(shape);
        brush.fill(g2d, shape);
    }
    
}
