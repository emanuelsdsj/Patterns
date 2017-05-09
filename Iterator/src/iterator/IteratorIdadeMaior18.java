/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class IteratorIdadeMaior18 implements Iterator {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int contador;
    
    public IteratorIdadeMaior18(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
        contador = -1;
    }

    @Override
    public void first() {
        contador = -1;
    }

    @Override
    public Pessoa next() {
         
        while(contador < pessoas.size()) {
            contador++;
            if(pessoas.get(contador).getIdade() > 18)
                return pessoas.get(contador);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        if(contador >= pessoas.size() - 1)
            return true;
        return false;
    }
    
    
}
