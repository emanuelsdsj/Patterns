/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author emanuelssj
 */
public abstract class JanelaAbstrata {
    protected IJanelaPlataforma janelaPlataforma;

    public void setPlataforma(IJanelaPlataforma janelaPlataforma) {
        this.janelaPlataforma = janelaPlataforma;
    }
    
    public abstract void desenhar();
    
}
