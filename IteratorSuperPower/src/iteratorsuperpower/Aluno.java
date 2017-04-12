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
    private char sexo;
    
    public Aluno(String name, int idade, double altura, char sexo) {
        this.altura = altura;
        this.idade = idade;
        this.name = name;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public char getSexo() {
        return sexo;
    }
        
    @Override
    public String toString() {
        return this.name;
    }
    
}
