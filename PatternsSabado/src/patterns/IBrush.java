/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.Graphics2D;
import java.awt.Shape;

/**
 *
 * @author aluno
 */
public interface IBrush {
    public abstract void fill(Graphics2D g2d, Shape shape);
}
