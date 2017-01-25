/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragemcomum;

import interfaces.IAbstractFactory;
import interfaces.IGaragem;

/**
 *
 * @author aluno
 */
public class LocalComum implements IGaragem {

    @Override
    public String estacionar(IAbstractFactory carro) {
        return "Estacionando " + carro.toString() + " na garagem comum";
    }
    
}
