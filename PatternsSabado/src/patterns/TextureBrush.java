/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author aluno
 */
public class TextureBrush implements IBrush {
        @Override
    public void fill(Graphics2D g2d, java.awt.Shape shape) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("texture.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(TextureBrush.class.getName()).log(Level.SEVERE, null, ex);
        }
        TexturePaint texture = new TexturePaint(image, shape.getBounds2D());
        g2d.setPaint(texture);
        g2d.fill(shape);
    }
}
