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
public class Main {
    
    public static void main(String[] args) {
        PalioPrototype prototipoPalio = new PalioPrototype();
        FiestaPrototype prototipoFiesta = new FiestaPrototype();
        
        CarroPrototype palioNovo = prototipoPalio.clonar();
        palioNovo.setValorCompra(27900.0);
        CarroPrototype palioUsado = prototipoPalio.clonar();
        palioUsado.setValorCompra(21000.0);
        CarroPrototype fiestaNovo = prototipoFiesta.clonar();
        fiestaNovo.setValorCompra(25000.0);
        CarroPrototype fiestaUsado = prototipoFiesta.clonar();
        fiestaUsado.setValorCompra(22000.0);
        
        System.out.println(palioNovo.exibirInfo());
        System.out.println(palioUsado.exibirInfo());
        System.out.println(fiestaNovo.exibirInfo());
        System.out.println(fiestaUsado.exibirInfo());
    }
    
}
