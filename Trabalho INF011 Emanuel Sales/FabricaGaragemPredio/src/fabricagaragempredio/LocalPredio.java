/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragempredio;

import interfaces.IAbstractFactory;
import interfaces.IGaragem;

/**
 *
 * @author aluno
 */
public class LocalPredio implements IGaragem{

    @Override
    public String estacionar(IAbstractFactory carro) {
        return "Estacionando " + carro.toString() + " na garagem prédio ";
    }
      
}
