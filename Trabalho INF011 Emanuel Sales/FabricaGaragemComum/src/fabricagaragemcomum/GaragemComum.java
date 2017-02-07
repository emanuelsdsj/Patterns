/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragemcomum;

import interfaces.Carro;
import interfaces.IAbstractFactory;
import interfaces.IGaragem;

/**
 *
 * @author aluno
 */
public class GaragemComum implements IGaragem {

    @Override
    public String estacionar(Carro carro) {
        return "Estacionando na garagem comum um ";
    }
    
}
