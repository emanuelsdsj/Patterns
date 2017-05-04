/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public void visit(IElement element) {
        String methodName = "getScore";
        Method method;
        numDeAlunos++;
        try {
            method = element.getClass().getDeclaredMethod(methodName);
            method.getReturnType();
            try {
                scoreAcumulado = (double) method.invoke(element);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(VisitorScoreMedia.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(VisitorScoreMedia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }   
}
