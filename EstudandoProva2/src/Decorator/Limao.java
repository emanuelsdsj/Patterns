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
public class Limao extends Decorator {

    public Limao(IComponent decorator, boolean isAfter) {
        this.setDecorator(decorator);
        this.isAfter = isAfter;
    }

    @Override
    public void fazer() {
        if(isAfter) {
            this.decorator.fazer();
            System.out.println("Adicionando Limão");
        } else {
            System.out.println("Adicionando Limão");
            this.decorator.fazer();
        }
    }
}
