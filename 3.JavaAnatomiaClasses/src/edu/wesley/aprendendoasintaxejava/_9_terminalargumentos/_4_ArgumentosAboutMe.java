package edu.wesley.aprendendoasintaxejava._9_terminalargumentos;

public class _4_ArgumentosAboutMe {
    
    /*Argumentos
    Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] 
    de argumentos, do tipo String. Logo, podemos após a definição da classe a ser executada, informar
    estes parâmetros, exemplo:

    java MinhaClasse agumentoUm argumentoDois

    */

//Exemplo:

    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        }
    
}
