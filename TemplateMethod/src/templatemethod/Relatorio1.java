/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author emanuelssj
 */
public class Relatorio1 extends Subject {

    @Override
    protected void gerarCabecalho() {
        System.out.println("Cabeçalho 1");
    }

    @Override
    protected void gerarRodape() {
        System.out.println("Rodape 1");
    }
    
    
}
