/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author aluno
 */
public class VideoGame {
    private IConsole console;
    private IControle controle;
    
    public VideoGame(IConsole console, IControle controle) {
        this.console = console;
        this.controle = controle;
    }
    
    public String toString() {
        return this.console + " " + this.controle;
    }
}
