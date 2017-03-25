package main;

import calculadora.Calculadora2;
import calculadora.DivisaoCommand;
import calculadora.MultiplicacaoCommand;
import calculadora.SomaCommand;
import calculadora.SubtracaoCommand;
import interfaces.ICalculadora;
import interfaces.ICommand;
import java.io.IOException;
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
//        int menu = 7;
//        ICalculadora calculadora = new Calculadora();
//        
//        do {
//            System.out.println("1 - Somar");
//            System.out.println("2 - Multiplicar");
//            System.out.println("3 - Dividir");
//            System.out.println("4 - Subtração");
//            System.out.println("5 - Undo");
//            System.out.println("6 - Redo");
//            Scanner s = new Scanner(System.in);
//            menu = s.nextInt();
//            switch(menu) {     
//                case 1: {
//                    System.out.println("Insira o número: ");
//                    Scanner num = new Scanner(System.in);
//                    calculadora.soma(num.nextLong());
//                    break;
//                }
//                case 2: {                    
//                    System.out.println("Insira o número: ");
//                    Scanner num = new Scanner(System.in);
//                    calculadora.multiplicacao(num.nextLong());
//                    break;
//                }
//                case 3: {
//                    System.out.println("Insira o número: ");
//                    Scanner num = new Scanner(System.in);
//                    calculadora.divisao(num.nextLong());
//                    break;
//                }
//                case 4: {
//                    System.out.println("Insira o número: ");
//                    Scanner num = new Scanner(System.in);
//                    calculadora.subtracao(num.nextLong());
//                    break;
//                }
//                case 5: {
//                    System.out.println("Número anterior: ");
//                    calculadora.undo();
//                    break;
//                }
//                case 6: {
//                    System.out.println("Número posterior: ");
//                    calculadora.redo();
//                    break;
//                }
//            }
//            
//        } while(menu != 0);
//           

        Calculadora2 calculadora = new Calculadora2();
        ICommand soma = new SomaCommand(10, calculadora);
        soma.redo();
//        ICommand subtracao = new SubtracaoCommand(5, calculadora);
//        subtracao.redo();
        ICommand multiplicacao = new MultiplicacaoCommand(2, calculadora);
        multiplicacao.redo();
        multiplicacao.undo();
        ICommand divisao = new DivisaoCommand(5, calculadora);
        divisao.redo();
        System.out.println(calculadora.getNumero());
    }
}
