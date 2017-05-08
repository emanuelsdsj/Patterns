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
        Method method = null;
        boolean s = false;
        numDeAlunos++;
        Method[] methods = element.getClass().getMethods();
        for(Method m : methods) {
            if(m.getName() == methodName)
                s = true;
        }
        try {
        try {
        if(s) {
            method = element.getClass().getDeclaredMethod(methodName);
            method.getReturnType();
            scoreAcumulado = (double) method.invoke(element);
        }
        else
            numDeAlunos--; 
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
    }   
}
