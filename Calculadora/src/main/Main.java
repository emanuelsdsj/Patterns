package main;

import calculadora.Calculadora;
import calculadora.DivisaoCommand;
import calculadora.MultiplicacaoCommand;
import calculadora.SomaCommand;
import calculadora.SubtracaoCommand;
import interfaces.ICommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public static void main(String[] args) throws IOException {
        String menu = "";
        Calculadora calculadora = new Calculadora();
        List<ICommand> commands = new ArrayList<ICommand>();
        double numAtual = 0;
        int pos = 0;
        
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Subtração");
            System.out.println("5 - Undo");
            System.out.println("6 - Redo");
            Scanner s = new Scanner(System.in);
            menu = s.next();
            switch(menu) {     
                case "1": {
                    if(commands.size() != pos) {
                       commands = removerLista(pos, commands);
                       pos = commands.size();
                    }
                    System.out.println("Insira o número: ");
                    Scanner num = new Scanner(System.in);
                    commands.add(new SomaCommand(num.nextDouble(), calculadora));
                    commands.get(commands.size() - 1).redo();
                    System.out.println(calculadora.getNumero());
                    numAtual = calculadora.getNumero();
                    pos = commands.size();
                    break;
                }
                case "2": {   
                    if(commands.size() != pos) {
                       commands = removerLista(pos, commands);
                       pos = commands.size();
                    }
                    System.out.println("Insira o número: ");
                    Scanner num = new Scanner(System.in);
                    commands.add(new MultiplicacaoCommand(num.nextDouble(), calculadora));
                    commands.get(commands.size() - 1).redo();
                    System.out.println(calculadora.getNumero());
                    numAtual = calculadora.getNumero();
                    pos = commands.size();
                    break;
                }
                case "3": {
                    if(commands.size() != pos) {
                       commands = removerLista(pos, commands);
                       pos = commands.size();
                    }
                    System.out.println("Insira o número: ");
                    Scanner num = new Scanner(System.in);
                    commands.add(new DivisaoCommand(num.nextDouble(), calculadora));
                    commands.get(commands.size() - 1).redo();
                    System.out.println(calculadora.getNumero());
                    numAtual = calculadora.getNumero();
                    pos = commands.size();
                    break;
                }
                case "4": {
                    if(commands.size() != pos) {
                       commands = removerLista(pos, commands);
                       pos = commands.size();
                    }
                    System.out.println("Insira o número: ");
                    Scanner num = new Scanner(System.in);
                    commands.add(new SubtracaoCommand(num.nextDouble(), calculadora));
                    commands.get(commands.size() - 1).redo();
                    System.out.println(calculadora.getNumero());
                    numAtual = calculadora.getNumero();
                    pos = commands.size();   
                    break;
                }
                case "5": {
                    if(commands.size() != 0 && pos != 0) {
                        System.out.println("Número anterior: ");
                        commands.get(pos - 1).undo();
                        pos--;
                        System.out.println(calculadora.getNumero());
                    }
                    System.out.println(calculadora.getNumero());
                    break;
                }
                case "6": {
                    if(commands.size() != 0 && pos != commands.size()) {
                        System.out.println("Número posterior: ");
                        pos++;
                        commands.get(pos - 1).redo();
                        System.out.println(calculadora.getNumero());
                    }
                    System.out.println(calculadora.getNumero());
                    break;
                }
                default: System.out.println("opção não existe");
            }
            
        } while(menu != "0");
    }
    public static List removerLista(int pos, List commands) {
        List<ICommand> commands2 = new ArrayList<ICommand>();
        for(int i =0; i < pos; i++)
            commands2.add((ICommand) commands.get(i));
        
        return commands2;
    }
}
