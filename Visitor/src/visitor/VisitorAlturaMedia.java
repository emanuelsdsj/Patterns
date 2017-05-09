/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
        Method method = null;
        boolean s = false;
        numPessoasVisitadas++;
        try {
        try {
            method = element.getClass().getDeclaredMethod(methodName);
            method.getReturnType();
            alturaAcumulada += (double) method.invoke(element);
        } catch (NoSuchMethodException ex) {
            numPessoasVisitadas--;
        } catch (SecurityException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
}
