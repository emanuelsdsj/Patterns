/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Emanuel", 23);
        Pessoa pessoa2 = new Pessoa("Ricardo", 15);
        Pessoa pessoa3 = new Pessoa("Manoela", 17);
        Pessoa pessoa4 = new Pessoa("Leo", 35);
        Pessoa pessoa5 = new Pessoa("Geraldo", 74);
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        
        Iterator iterator = new IteratorIdadeMaior18(pessoas);
        Pessoa p = null;
        
        while(!iterator.isDone()) {
            p = iterator.next();
            if(p != null)
                System.out.println(p.getNome());
        }   
    } 
}
