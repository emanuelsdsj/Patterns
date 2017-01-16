/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryConsoles;

/**
 *
 * @author Emanuel
 */
public class TesteFactory {
    
    private static VideoGame montarVideoGame(String Tipo){
        VideoGameFactory vgf = null;
        if(Tipo == "PS4"){
            vgf = new PS4Factory();
        }
        else if(Tipo == "NintendoSwitch"){
            vgf = new NintendoSwitchFactory();
        }
        VideoGame vg = new VideoGame();
        vg.setConsole(vgf.montarConsole());
        vg.setControle(vgf.montarControle());
        return vg;
    }
    
    public static void main(String[] args) {
        VideoGame videogame1 = montarVideoGame("PS4");
        VideoGame videogame2 = montarVideoGame("NintendoSwitch");
        System.out.println("videogame1 console = " + videogame1.console + " videogame1 controle = " + videogame1.controle + "/n");
        System.out.println("videogame2 console = " + videogame2.console + " videogame2 controle = " + videogame2.controle);
    }
}
