/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author thiago
 */
public class Texto implements ITag{
    private String texto;
    
    public Texto(String texto){
        this.texto = texto;
    }
    
    @Override
    public void printTag() {
        System.out.println(this.texto);
    }
    
}
