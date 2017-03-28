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
public class Main {
    
    public static void main(String[] args) {
        OpenGLImage opengl = new OpenGLImage();
        ImagemTarget adapter = new AdapterOpenGL(opengl);
        adapter.carregarImagem();
        adapter.desenharImagem();
    }
    
}
