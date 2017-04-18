/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import observers.Aluno;
import observers.Bolsista;
import observers.IObserver;
import subjects.Coordenador;
import subjects.Professor;
import subjects.Subject;

/**
 *
 * @author emanuelssj
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor = new Professor("Mauricio");
        Professor professor2 = new Professor("Helena");
        Aluno aluno = new Aluno("Leo");
        Aluno aluno2 = new Aluno("Lucas");
        Aluno aluno3 = new Aluno("geovana");
        professor.addObserver(aluno);
        professor2.addObserver(aluno);
        professor.addObserver(aluno2);
        professor2.addObserver(aluno3);
        professor.enviarMensagem("Olá alunos");
        professor2.enviarMensagem("Olá alunos");
    }
    
}
