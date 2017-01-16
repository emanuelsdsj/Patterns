/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import carroLuxo.FabricaCarroLuxo;
import carroPopular.FabricaCarroPopular;
import interfaces.IAbstractFactory;

/**
 *
 * @author aluno
 */
public class Main {

    public void usarFabrica(IAbstractFactory factory){
        factory.createMotor().ligar();
        factory.createRoda().alinhar();
        factory.createSom().tocar();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.usarFabrica(new FabricaCarroPopular());
        main.usarFabrica(new FabricaCarroLuxo());
    }
    
}
