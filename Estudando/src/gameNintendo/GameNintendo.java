/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameNintendo;

import Interfaces.IGame;
import Interfaces.VideoGame;

/**
 *
 * @author aluno
 */
public class GameNintendo implements IGame {

   @Override
    public void iniciarGame(VideoGame videogame) {
        System.out.println("Iniciando game de Nintendo no videogame com o console e controle " + videogame.toString());
    }   
}
