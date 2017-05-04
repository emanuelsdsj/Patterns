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
public interface IVisitor {
    public abstract void visitAluno(Aluno aluno);
    public abstract void visitProfessor(Professor professor);
    public abstract void visit(IElement element);
}
