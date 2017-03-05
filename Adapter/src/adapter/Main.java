/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author emanuelssj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IShape shapeText = new TextAdapter();
        IShape shapeRect = new Rect();
        
        System.out.println("Rect = "); 
        shapeRect.desenhar();
        System.out.println("Text = ");
        shapeText.desenhar();
    }
    
}
