/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author emanuelssj
 */
public class Rectangle implements IComponent {

    @Override
    public void girar() {
        System.out.println("Rectangle girando");
    }

    @Override
    public void adicionar(IComponent component) {
        throw new UnsupportedOperationException("Não é um composite");
    }

    @Override
    public void remover(IComponent component) {
        throw new UnsupportedOperationException("Não é um composite");
    }
    
}
