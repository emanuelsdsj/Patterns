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
public class IteratorSuperPower implements Iterator {
    private ArrayList<Aluno> lista;
    private int contador;
    private String operador;
    private int idade;
    
 
    protected IteratorSuperPower(ArrayList<Aluno> lista, String operador, int idade) {
        this.lista = lista;
        this.idade = idade;
        this.operador = operador;
        contador = -1;
    }
 
    @Override
    public void first() {
        contador = 0;
    }
 
    @Override
    public Object next() {
        contador++;
        if(!isDone()) {
            if(operador.equals("==")) {
                while(!isDone()) {
                    if(lista.get(contador).getIdade() == idade) 
                        return lista.get(contador);
                     else if(contador < lista.size() - 1)
                        contador++;
                }
            } else if(operador.equals(">")) {
                while(!isDone()) {
                    if(lista.get(contador).getIdade() > idade) 
                        return lista.get(contador);
                    else if(contador < lista.size() - 1)
                        contador++;
                }
            } else if(operador.equals("<")) {
                while(!isDone()) {
                    if(lista.get(contador).getIdade() < idade) 
                        return lista.get(contador);
                     else if(contador < lista.size() - 1)
                        contador++;
                }
            } else if(operador.equals("!=")) {
                while(!isDone()) {
                    if(lista.get(contador).getIdade() != idade) 
                        return lista.get(contador);
                     else if(contador < lista.size() - 1)
                        contador++;
                }
            }
        }
        return null;
    }
 
    @Override
    public boolean isDone() {
        return contador >= lista.size() - 1;
    }
}
