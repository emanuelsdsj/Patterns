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
public abstract class Subject {
    protected abstract void gerarCabecalho();
    protected abstract void gerarRodape();
    
    public void gerarRelatorio() {
        gerarCabecalho();
        System.out.println("Meio do relatório");
        gerarRodape();
    }
}
