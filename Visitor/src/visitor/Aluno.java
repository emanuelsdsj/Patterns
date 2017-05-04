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
public class Aluno implements IElement {
    private double score;
    private double altura;

    public Aluno(double score, double altura) {
        this.score = score;
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

//    @Override
//    public void accept(IVisitor visitor) {
//        visitor.visitAluno(this);
//    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }   
}
