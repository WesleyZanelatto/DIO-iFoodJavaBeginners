package edu.wesley._5_estruturaderepeticaoearraysemjava._2_arrays;

import java.util.Scanner;

/**
 * <h1>Exercício 1</h1>
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 * 
 * Ex.: Digitou: 1 2 3 4 5 6
 *      Imprimir: 6 5 4 3 2 1
 * 
 * <p>
 * <b>Note:</b> Sempre leia atentamente a documentação!
 *
 * @author Wesley Zanelatto
 * @version 6.0
 * @since 15/11/2022
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
            
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int [6];
        int i=0;

        System.out.println("Digite 6 números inteiros: ");

        for(i=0;i<6;i++){
            vetor[i] = ler.nextInt();
            
        }

        System.out.println("\nNúmeros na sequência inversa: ");
        for(i=5;i>=0;i--){
            System.out.printf("%d ",vetor[i]);
        }
        System.out.print("\n\n");

    }
}
