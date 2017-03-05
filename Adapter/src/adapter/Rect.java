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
public class Rect implements IShape {

    @Override
    public void desenhar() {
        System.out.println("Desenhando rectangle");
    }
    
}
