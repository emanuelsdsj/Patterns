/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePs4;

import Interfaces.IGame;
import Interfaces.VideoGame;

/**
 *
 * @author aluno
 */
public class GamePs4 implements IGame {

    @Override
    public void iniciarGame(VideoGame videogame) {
        System.out.println("Iniciando game de ps4 no videogame com o console e controle " + videogame.toString());
    }
    
}
