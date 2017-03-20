/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g, String formato, String preenchimento) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
        
        if(formato.equalsIgnoreCase("Retangulo")){
            Shape rect = new Rectangle();
            IBrush brush = new SolidBrush();
            rect.setBrush(brush);
            rect.draw(300, 50, 200, 100, g2d);
        }
        
        Shape ellipse = new Ellipse();
        ellipse.setBrush(brush);
        ellipse.draw(300, 250, 200, 100, g2d);
        
        IBrush brush2 = new TextureBrush();
        
        Shape rect2 = new Rectangle();
        rect2.setBrush(brush2);
        rect2.draw(600, 50, 200, 100, g2d);
        
        Shape ellipse2 = new Ellipse();
        ellipse2.setBrush(brush2);
        ellipse2.draw(600, 250, 200, 100, g2d);
    }
}
