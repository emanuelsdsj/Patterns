/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeexemplo;

/**
 *
 * @author Emanuel
 */
public class PalioPrototype extends CarroPrototype {
    
    protected PalioPrototype(FiestaPrototype fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();
    }
    
    public PalioPrototype() {
        valorCompra = 0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Palio\nMontadora: Fiat\n" + "Valor: R$" + getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new PalioPrototype();
    }
}
