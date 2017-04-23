/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author emanuelssj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario desenvolvedor = new Funcionario("Desenvolvedor", 4000);
        Funcionario gerente = new Funcionario("DBA", 1900);
        Funcionario dba = new Funcionario("Gerente", 4000);
        
        System.out.println(desenvolvedor.calcularSalarioComImposto() + " " + gerente.calcularSalarioComImposto() + " " + dba.calcularSalarioComImposto());
    }
    
}
