/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorsuperpower;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("Leo", 20, 2.0));
        alunos.add(new Aluno("Mauricio", 18, 1.7));
        alunos.add(new Aluno("Ana", 20, 1.6));
        alunos.add(new Aluno("Geovana", 19, 1.8));
        Iterator iteratorAluno = new IteratorSuperPower(alunos, ">", 18);
        while(!iteratorAluno.isDone()) {
            Object a = iteratorAluno.next();
            if(a != null)
                System.out.println(a.toString());
        }
            
            
    }
}
