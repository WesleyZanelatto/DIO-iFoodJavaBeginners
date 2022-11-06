package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;

/**
 * <h1>Exercício 4</h1>
 * Faça um programa que peça n números inteiros,
 * calcule e mostre a quantidade de números quantPares
 * e a quantidade de números quantImpares.
 * <p>
 * <b>Note:</b> Sempre leia atentamente a documentação!
 *
 * @author Wesley Zanelatto
 * @version 4.0
 * @since 21/10/2022
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Declaração das variáveis
        int i = 0, cont = 1, numeros = 0, quantNumeros = 1, quantPares = 0, quantImpares = 0;
        int[] par = new int[100];//Vetor par, armazena os números Pares digitados
        int[] impar = new int[100];//Vetor ímpar, armazena os números ímpares digitados

        //Vai solicitar a quantidade de números que deverá ser digitados
        System.out.printf("\nQual a quantidade de números a serem digitados: ");
        quantNumeros = ler.nextInt();
        System.out.printf("\n");

        do {
            System.out.printf("Digite o %dº número inteiro: ",cont);
            numeros = ler.nextInt();

            if (numeros % 2 == 0) {//Caso o números seja par
                par[cont] = numeros;//Armazena os números Pares
                quantPares++;//Soma a quantidade de números Pares digitados
            } else {//Caso o números seja ímpar
                impar[cont] = numeros;//Armazena os números ímpares
                quantImpares++;//Soma a quantidade de números ímpares digitados
            }
            cont++;//Contador para quantidade de números digitados
        } while (cont <= quantNumeros);

        //Imprimindo os dados dos números Pares
        System.out.printf("\n\nQuantidade de Números Pares digitados: %d\n",quantPares);
        System.out.printf("Números Pares digitados: ");
        for (i = 0; i < par.length; i++) {
            if (par[i] > 0) {
                System.out.printf("%d, ", par[i]);
            }
        }

        //Imprimindo os dados dos números ímpares
            System.out.printf("\n\nQuantidade de Números ímpares digitados: %d\n",quantImpares);
        System.out.printf("Números ímpares digitados: ");
        for (i = 0; i < impar.length; i++) {
            if (impar[i] > 0) {
                System.out.printf("%d, ", impar[i]);
            }
                        
        }
        System.out.printf("\n\n");//Pula duas linhas
    }

    // //Resolução do professor
    // int numeros;
    //     int numero;
    //     int quantPares = 0, quantImpares = 0;

    //     System.out.println("Quantidade de números: ");
    //     numeros = scan.nextInt();

    //     int count = 0;
    //     do {
    //         System.out.println("Número: ");
    //         numero = scan.nextInt();

    //         if (numero % 2 == 0 ) quantPares++;
    //         else quantImpares++;

    //         count++;
    //     } while(count < numeros);

    //     System.out.println("Quantidade Par: " + quantPares);
    //     System.out.println("Quantidade Ímpar: " + quantImpares);
    // }

    }
