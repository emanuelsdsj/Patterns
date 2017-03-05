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
public class Win1 extends WindowAbstract {

    @Override
    public void show() {
        this.platform.drawLine();
        System.out.println("Win1 visível");
    }

}
