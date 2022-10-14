package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._9_terminalargumentos;

import java.util.Locale;
import java.util.Scanner;

public class _5_ScannerAboutMe {
    public static void main(String[] args) {
        //criando o objeto ler
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);//Locale.US -> é o padrão Americano
        
        System.out.printf("\nDigite seu nome: ");
        String nome = ler.next(); //.next() -> é para retornar uma String
        
        System.out.printf("Digite seu sobrenome: ");
        String sobrenome = ler.next();

        System.out.printf("Digite sua idade: ");
        int idade = ler.nextInt();//.nextInt() -> é para retornar um número inteiro
        
        System.out.printf("Digite sua altura: ");
        double altura = ler.nextDouble();//.nextDouble() -> é para retornar um número de ponto flutuante Double

        
        //imprimindo os dados obtidos pelo usuario
        // System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Minha altura é " + altura + "cm ");
        
        //outra forma de imprimir os dados digitados
        System.out.printf("\n Olá, me chamo %s %s \n Tenho %d anos \n Minha altura é %.2f",nome,sobrenome,idade,altura);
        
        
    }
}
