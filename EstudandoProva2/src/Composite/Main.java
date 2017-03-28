/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanuelssj
 */
public class Main {
    public static void main(String[] args) {
        IComponent composite = new Composite();
        IComponent composite2 = new Composite();
        IComponent rec1 = new Rectangle();
        IComponent rec2 = new Rectangle();
        IComponent tri1 = new Triangle();
        IComponent tri2 = new Triangle();
        
//        try {
//            rec1.adicionar(composite);
//        } catch (Exception ex) {
//            ex = new Exception("Não é um composite");
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            composite.adicionar(rec1);
            composite.adicionar(tri1);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            composite2.adicionar(rec2);
            composite2.adicionar(tri2);
            composite.adicionar(composite2);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        composite.girar();
    }
}
