package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;

/**
 * <h1>Exercício 5</h1>
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada do 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * <p>
 * <b>Note:</b> Sempre leia atentamente a documentação!
 *
 * @author Wesley Zanelatto
 * @version 5.0
 * @since 21/10/2022
 */
public class Ex5_Tabuada {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int tabuada=0, i=0;

        System.out.printf("\nDigite qual a tabuada deseja realizar: ");
        tabuada=ler.nextInt();

        if(tabuada>=1 && tabuada<=10){
        System.out.println("Tabuada do " + tabuada + ":");

        for(i=1;i<=10;i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada*i);
        }
        }else{
            System.out.println("Número Inválido! Tente novamente com números de 1 a 10.");
        }
        
        // //Resolução do professor
        // System.out.println("Tabuada: ");
        // int tabuada = scan.nextInt();

        // System.out.println("Tabuada de " + tabuada);
        // for(int i = 1; i <= 10; i = i + 1) {
        //     System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        // }

    }
}
