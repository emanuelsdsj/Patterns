/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author aluno
 */
public class SolidBrush implements IBrush {

    @Override
    public void fill(Graphics2D g2d, Shape shape) {
        g2d.setPaint(new Color(255,0,0));
        g2d.fill(shape);
    }
    
}
