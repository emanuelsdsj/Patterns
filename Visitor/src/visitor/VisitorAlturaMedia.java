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

    @Override
    public void visit(IElement element) {
        String methodName = "getAltura";
        Method method;
        numPessoasVisitadas++;
        try {
            method = element.getClass().getDeclaredMethod(methodName);
            method.getReturnType();
            try {
                alturaAcumulada = (double) method.invoke(element);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(VisitorScoreMedia.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(VisitorScoreMedia.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
