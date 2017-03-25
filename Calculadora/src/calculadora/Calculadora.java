/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import interfaces.ICalculadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Calculadora implements ICalculadora {
    private double numero = 0;
    private ArrayList<Double> numeroOld = new ArrayList<Double>();
    private int posicao = 0;
    
    public Calculadora() {
        numeroOld.add(this.numero);
    }

    @Override
    public double soma(double numero) {
        posicao++;
        this.numero = this.numero + numero;
        numeroOld.add(this.numero);
        System.out.println("Resultado: " + this.numero);
        return this.numero;
    }

    @Override
    public double subtracao(double numero) {
        posicao++;
        this.numero = this.numero - numero;
        numeroOld.add(this.numero);
        System.out.println("Resultado: " + this.numero);
        return this.numero;
    }

    @Override
    public double multiplicacao(double numero) {
        posicao++;
        this.numero = this.numero * numero;
        numeroOld.add(this.numero);
        System.out.println("Resultado: " + this.numero);
        return this.numero;
    }

    @Override
    public double divisao(double numero) {
        posicao++;
        this.numero = this.numero / numero;
        numeroOld.add(this.numero);
        System.out.println("Resultado: " + this.numero);
        return this.numero;
    }

    @Override
    public void redo() {
         if(numeroOld.size() - 1 != posicao) {
            posicao++;
            this.numero = numeroOld.get(posicao);
            System.out.println("Resultado: " +  "redo " + this.numero);
        }
    }

    @Override
    public void undo() {
        if(posicao > 0) {
            posicao--;
            this.numero = numeroOld.get(posicao);
            System.out.println("Resultado: " + "undo " + this.numero);
        }
    } 
}
