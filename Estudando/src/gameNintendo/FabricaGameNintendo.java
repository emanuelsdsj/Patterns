/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameNintendo;

import Interfaces.ICreator;
import Interfaces.IGame;

/**
 *
 * @author aluno
 */
public class FabricaGameNintendo implements ICreator {

    @Override
    public IGame createGame() {
        return new GameNintendo();
    }
    
}
