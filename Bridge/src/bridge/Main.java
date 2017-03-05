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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPlatform linux = new Linux();
        IPlatform osx = new OSX();
        WindowAbstract win1 = new Win1();
        WindowAbstract win2 = new Win2();
        
        win1.setPlatform(osx);
        win1.show();
        win1.setPlatform(linux);
        win1.show();
        
        win2.setPlatform(osx);
        win2.show();
        win2.setPlatform(linux);
        win2.show();
       
    }
    
}
