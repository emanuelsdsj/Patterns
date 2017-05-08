/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Main {
    private static ArrayList<IElement> agregado =  new ArrayList<IElement>();
    private static ArrayList<IVisitor> visitors = new ArrayList<IVisitor>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        agregado.add(new Aluno(8, 2.0));
        agregado.add(new Aluno(5, 1.70));
        agregado.add(new Professor(2, 1.80));
        agregado.add(new Aluno(10, 1.4));
        agregado.add(new Professor(20, 1.5));
        
        visitors.add(new VisitorAlturaMedia());
        visitors.add(new VisitorScoreMedia());
        
        realizarVisitacoes();
        VisitorAlturaMedia visitor = (VisitorAlturaMedia) visitors.get(0);
        VisitorScoreMedia visitor2 = (VisitorScoreMedia) visitors.get(1);
        System.out.println("Altura Média = " + visitor.getAlturaMedia());
        System.out.println("Score Média = " + visitor2.getScoreMedia());
    }
    
    public static void realizarVisitacoes() {
        for(IElement element : agregado)
            for(IVisitor visitor : visitors)
                element.accept(visitor);        
    }
    
}
