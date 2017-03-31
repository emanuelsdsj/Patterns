/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public class MyPanel extends JPanel {
    private IBrush selectedBrush;
    private Shape selectedShape;
    
    
    public MyPanel(IBrush selectedBrush, Shape selectedShape) {
        this.selectedBrush = selectedBrush;
        this.selectedShape = selectedShape;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
           
        this.selectedShape.setBrush(this.selectedBrush);
        this.selectedShape.draw(300, 50, 200, 100, g2d);
    }
}
