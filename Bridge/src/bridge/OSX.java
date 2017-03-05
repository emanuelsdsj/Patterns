/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author emanuelssj
 */
public class OSX implements IPlatform {

    @Override
    public void drawLine() {
        System.out.println("Desenhando no OSX");
    }
    
}
