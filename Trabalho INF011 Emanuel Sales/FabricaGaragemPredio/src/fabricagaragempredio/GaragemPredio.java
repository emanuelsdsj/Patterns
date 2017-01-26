/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragempredio;

import interfaces.Carro;
import interfaces.IGaragem;

/**
 *
 * @author aluno
 */
public class GaragemPredio implements IGaragem{

    @Override
    public String estacionar(Carro carro) {
        return "Estacionando na garagem prédio um ";
    }
      
}
