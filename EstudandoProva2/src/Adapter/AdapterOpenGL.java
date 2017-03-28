/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author emanuelssj
 */
public class AdapterOpenGL implements ImagemTarget {
    private OpenGLImage opengl;

    public AdapterOpenGL(OpenGLImage opengl) {
        this.opengl = opengl;
    }

    @Override
    public void carregarImagem() {
        opengl.carregarImagem();
    }

    @Override
    public void desenharImagem() {
       opengl.desenharImagem();
    }
    
}
