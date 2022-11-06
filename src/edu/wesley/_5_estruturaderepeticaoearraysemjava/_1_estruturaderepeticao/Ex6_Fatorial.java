package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;

/**
 * <h1>Exercício 5</h1>
 * Faça um programa que calcule o fatorialde um número inteiro
 * fornecido pelo usuário.
 * 
 * Ex.: 5!= 120
 * 
 * <p>
 * <b>Note:</b> Sempre leia atentamente a documentação!
 *
 * @author Wesley Zanelatto
 * @version 5.0
 * @since 21/10/2022
 */
public class Ex6_Fatorial {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        int fat=0, n=0 ,n2=0;

        System.out.println("Digite um número para cálcular o seu fatorial: ");
        n = ler.nextInt();
        n2 = n;
        for(fat=1; n>1; n--){
            fat*=n;
        }
        System.out.println( n2 + "! = " + fat);
    }
}
