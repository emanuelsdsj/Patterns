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
public class Funcionario {
    private double salarioBase;
    private CalculaImposto estrategiaDeCalculo;
    private String cargo;
    
    public Funcionario(String cargo, double salarioBase) {
        this.salarioBase = salarioBase;
        switch (cargo) {
        case "Desenvolvedor":
            this.cargo = cargo;
            break;
        case "DBA":
            this.cargo = cargo;
            break;
        case "Gerente":
            this.cargo = cargo;
            break;
        default:
            throw new RuntimeException("Cargo não encontrado :/");
        }
    }

    public void setEstrategiaDeCalculo(CalculaImposto estrategiaDeCalculo) {
        this.estrategiaDeCalculo = estrategiaDeCalculo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double calcularSalarioComImposto() {
        return estrategiaDeCalculo.calculaSalarioComImposto(this);
    }
}
