/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.Graphics2D;

/**
 *
 * @author aluno
 */
public abstract class Shape {
    public abstract void draw(double x, double y, double w, double h, Graphics2D g2d);
    public void setBrush(IBrush brush) {
        this.brush = brush;
    }

    protected IBrush brush;
}
