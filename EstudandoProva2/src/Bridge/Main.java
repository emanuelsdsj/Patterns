/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import Adapter.*;

/**
 *
 * @author emanuelssj
 */
public class Main {
    
    public static void main(String[] args) {
        IJanelaPlataforma janelaLinux = new Linux();
        IJanelaPlataforma janelaWindows = new WIndows();
        JanelaAbstrata janelaAviso = new JanelaAviso();
        JanelaAbstrata janelaDialogo = new JanelaDialogo();
        
        janelaAviso.setPlataforma(janelaLinux);
        janelaAviso.desenhar();
        janelaAviso.setPlataforma(janelaWindows);
        janelaAviso.desenhar();
        janelaDialogo.setPlataforma(janelaLinux);
        janelaDialogo.desenhar();
        janelaDialogo.setPlataforma(janelaWindows);
        janelaDialogo.desenhar();
    }
    
}
