/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragempredio;

import interfaces.IAbstractFactory;
import interfaces.IGaragem;
import interfaces.ILocal;

/**
 *
 * @author aluno
 */
public class FabricaGaragemPredio implements IGaragem{

    @Override
    public ILocal estacionaCarro() {
        return new LocalPredio();
    }

}
