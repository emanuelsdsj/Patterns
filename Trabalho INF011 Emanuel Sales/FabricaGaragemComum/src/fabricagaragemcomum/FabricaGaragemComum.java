/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricagaragemcomum;

import interfaces.IAbstractFactory;
import interfaces.IGaragem;
import interfaces.ILocal;

/**
 *
 * @author aluno
 */
public class FabricaGaragemComum implements IGaragem{

    @Override
    public ILocal estacionaCarro() {
        return new LocalComum();
    }

}
