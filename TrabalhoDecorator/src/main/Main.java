/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Interfaces.IComponent;
import decorator.Bolo;
import decorator.CaldaChocolate;
import decorator.Canela;
import decorator.ChocolateGranulado;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IComponent canela = new Canela(new ChocolateGranulado(new CaldaChocolate(new Bolo())));
        System.out.println(assarBolo(canela));
    }
    
    public static String assarBolo(IComponent component) {
        return component.fazer();
    }
    
}
