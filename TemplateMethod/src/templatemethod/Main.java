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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject relatorio1 = new Relatorio1();
        Financas financas = new Financas();
        financas.setSubject(relatorio1);
        financas.relatorio();
    }
    
}
