/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author emanuelssj
 */
public class TextAdapter implements IShape {
    private LibText libtext;
    
    public TextAdapter() {
        libtext = new LibText();
    }

    public void setLibtext(LibText libtext) {
        this.libtext = libtext;
    }
    
    @Override
    public void desenhar() {
        this.libtext.showDesenhar();
    }
    
}
