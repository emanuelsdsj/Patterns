/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PS4;

import Interface.IConsole;
import Interface.IControle;
import Interface.IVideogame;

/**
 *
 * @author aluno
 */
public class PS4Videogame implements IVideogame{

    @Override
    public IControle montarControle() {
        return new ControleDualshock4();
    }

    @Override
    public IConsole montarConsole() {
        return new ConsolePS4();
    }
    
}
