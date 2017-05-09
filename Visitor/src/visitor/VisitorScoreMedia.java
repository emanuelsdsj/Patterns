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
    
    public double getScoreMedia() {
        return scoreAcumulado / numDeAlunos;
    }

    @Override
    public void visit(IElement element) {
        String methodName = "getScore";
        Method method = null;
        boolean s = false;
        numDeAlunos++;
        try {
            method = element.getClass().getDeclaredMethod(methodName);
            method.getReturnType();
            scoreAcumulado += (double) method.invoke(element);
        } catch (NoSuchMethodException ex) {
            numDeAlunos--;
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }   
}
