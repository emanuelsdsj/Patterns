/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author aluno
 */
public class Professor implements IElement {
    private double altura;
    private int numeroDePublicacao;

    public Professor(int numeroDePublicacao, double altura) {
        this.altura = altura;
        this.numeroDePublicacao = numeroDePublicacao;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroDePublicacao() {
        return numeroDePublicacao;
    }

    public void setNumeroDePublicacao(int numeroDePublicacao) {
        this.numeroDePublicacao = numeroDePublicacao;
    }
    
//    @Override
//    public void accept(IVisitor visitor) {
//        visitor.visitProfessor(this);
//    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }  
}
