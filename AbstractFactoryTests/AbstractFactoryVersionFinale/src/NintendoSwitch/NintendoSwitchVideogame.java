/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NintendoSwitch;

import Interface.IConsole;
import Interface.IControle;
import Interface.IVideogame;

/**
 *
 * @author aluno
 */
public class NintendoSwitchVideogame implements IVideogame{

    @Override
    public IControle montarControle() {
        return new ControleJoycons();
    }

    @Override
    public IConsole montarConsole() {
        return new ConsoleNintendoSwitch();
    }
    
}
