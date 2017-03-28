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
public class JanelaAviso extends JanelaAbstrata {

    @Override
    public void desenhar() {
        janelaPlataforma.desenharJanela();
        System.out.println("Janela Aviso");
    }
    
}
