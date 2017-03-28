/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Adapter.*;

/**
 *
 * @author emanuelssj
 */
public class Main {
    
    public static void main(String[] args) {
        OpenGLImage openglImagem = new OpenGLImage();
        OpenGL3D opengl3d = new OpenGL3D();
        Facade facade = new Facade(openglImagem, opengl3d);
        facade.iniciarOpenGL();
        facade.desenharImagem();
        facade.renderizar2D();
        facade.renderizar3D();
    }  
}
