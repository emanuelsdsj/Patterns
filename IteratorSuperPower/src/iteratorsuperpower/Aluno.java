/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorsuperpower;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String name;
    private int idade;
    private double altura;
    
    public Aluno(String name, int idade, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.name = name;
    }

    public double getIdade() {
        return idade;
    }
        
    @Override
    public String toString() {
        return this.name;
    }
    
}
