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
public class VisitorScoreMedia implements IVisitor {
    private double scoreAcumulado = 0;
    private int numDeAlunos = 0;
    
    @Override
    public void visitAluno(Aluno aluno) {
        numDeAlunos++;
        scoreAcumulado = aluno.getScore();
    }

    @Override
    public void visitProfessor(Professor professor) {
        
    }
    
    public double getScoreMedia() {
        return scoreAcumulado / numDeAlunos;
    }
    
}
