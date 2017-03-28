/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author emanuelssj
 */
public class Main {
    public static void main(String[] args) {
       IComponent decorator = new Limao(new Limao(new Suco(new Suco(new Vodka(), true), false), false), true);
       fazer(decorator);
    }
    
    public static void fazer(IComponent component) {
        component.fazer();
    }
}
