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
public class Financas {
    private Subject subject;
    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    public void relatorio() {
        subject.gerarRelatorio();
    }
}
