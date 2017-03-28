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
public interface IComponent {
    public void girar();
    public void adicionar(IComponent component) throws Exception;
    public void remover(IComponent component) throws Exception;
}
