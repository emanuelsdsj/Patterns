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
public class Facade {
    private OpenGLImage openglImagem;
    private OpenGL3D opengl3d;

    public Facade(OpenGLImage openglImagem, OpenGL3D opengl3d) {
        this.openglImagem = openglImagem;
        this.opengl3d = opengl3d;
    }
    
    public void iniciarOpenGL() {
        openglImagem.carregarImagem();
        opengl3d.configurarCores();
        opengl3d.configurarResolução();
    }

    public void desenharImagem() {
       openglImagem.desenharImagem();
    }
    
    public void renderizar2D() {
       opengl3d.renderizarGrafico2D();
    }
    
    public void renderizar3D() {
       opengl3d.renderizarGrafico3D();
    }
    
}
