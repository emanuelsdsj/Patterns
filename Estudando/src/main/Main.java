/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Interfaces.AbstractFactoryFlexivel;
import Interfaces.IConsole;
import Interfaces.IControle;
import Interfaces.IPrototype;
import prototypes.ConsoleNintendoWii;
import prototypes.DualShock2;
import prototypes.WhitePiano;
import videoGamePS4.FabricaVideoGamePS4;
import videoGameXbox.FabricaVideoGameXbox;
import Interfaces.IAbstractFactory;
import Interfaces.ICreator;
import Interfaces.VideoGame;
import gameNintendo.FabricaGameNintendo;
import gamePs4.FabricaGamePS4;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        //AbstractFactory
//        IAbstractFactory videogame = new FabricaVideoGamePS4();
//        videogame.createConsole().Ligar();
//        videogame.createControle().Controlar(); 
//        
//        videogame = new FabricaVideoGameXbox();
//        videogame.createConsole().Ligar();
//        videogame.createControle().Controlar();
        
       //FactoryMethod
//       IAbstractFactory videogame = FabricaVideoGamePS4.getInstance();
//       VideoGame ps4 = new VideoGame(videogame.createConsole(), videogame.createControle()); 
//       ICreator creatorNintendo = new FabricaGameNintendo();
//       ICreator creatorPS4 = new FabricaGamePS4();
//       creatorPS4.createGame().iniciarGame(ps4);
//       creatorNintendo.createGame().iniciarGame(ps4);
       
       //Prototype
//       AbstractFactoryFlexivel aff = new AbstractFactoryFlexivel();
//       //IControle dualShock2 = new DualShock2("PS3");
//       IConsole wii = new ConsoleNintendoWii("PS3");
//       IControle whitePiano = new WhitePiano("PS3");
//       IControle whitePianoClone;
//       IConsole wiiClone;
//       aff.addPrototype(wii.toString(), (IPrototype) wii);
//       aff.addPrototype(whitePiano.toString(),(IPrototype) whitePiano);
//       
//       wiiClone = (IConsole) aff.createPrototype(wii.toString());
//       whitePianoClone = (IControle) aff.createPrototype(whitePiano.toString());
//       
//       
//       wii.Ligar();
//       whitePiano.Controlar();
//       whitePianoClone.Controlar();
//       wiiClone.Ligar();
       
       //Singleton
//       IAbstractFactory videogame = FabricaVideoGamePS4.getInstance();
//       videogame.createConsole().Ligar();
//       videogame.createControle().Controlar();
//       
//       videogame = FabricaVideoGameXbox.getInstance();
//       videogame.createConsole().Ligar();
//       videogame.createControle().Controlar();
    }  
}
