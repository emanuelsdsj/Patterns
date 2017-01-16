package Main;

import Interface.IVideogame;
import NintendoSwitch.NintendoSwitchVideogame;
import PS4.PS4Videogame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Main {
    
    public void init(IVideogame iv) {
        iv.montarConsole().rodarSistema();
        iv.montarControle().darComandos();
    }

    public static void main(String[] args) {
       Main main = new Main();
       main.init(new NintendoSwitchVideogame());
       main.init(new PS4Videogame());
       
    }
    
}
