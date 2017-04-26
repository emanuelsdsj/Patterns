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
public class VisitorAlturaMedia implements IVisitor {
    private double alturaAcumulada = 0;
    private int numPessoasVisitadas = 0;
    
    @Override
    public void visitAluno(Aluno aluno) {
        numPessoasVisitadas++;
        alturaAcumulada += aluno.getAltura();
    }

    @Override
    public void visitProfessor(Professor professor) {
        numPessoasVisitadas++;
        alturaAcumulada = professor.getAltura();
    }
    
    public double getAlturaMedia() {
        return alturaAcumulada / numPessoasVisitadas;
    }
    
}
