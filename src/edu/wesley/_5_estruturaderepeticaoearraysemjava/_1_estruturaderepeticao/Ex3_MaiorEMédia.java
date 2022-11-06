package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;
/**
    * <h1>Exercício 3</h1>
    * Faça um programa que leia 5 números
    * e informe o maior número
    * e a média desses números.
    * <p>
    * <b>Note:</b> Sempre leia atentamente a documentação!
    *
    * @author  Wesley Zanelatto
    * @version 3.0
    * @since   20/10/2022
*/
public class Ex3_MaiorEMédia {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        int[] vetor= new int[6]; //Declarando um Array
        int i=1,maior=0;
        double somatorio=0;


        for(i=1;i<=5;i++){
            System.out.printf("Digite o %dº número: ",i);
            vetor[i]=ler.nextInt();
            somatorio+=vetor[i];

            if(vetor[i]>maior){
                maior = vetor[i];
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.printf("Média: %.2f",somatorio/(i-1));

        //Resolução do professor
        // int numero;
        // int maior = 0;
        // int soma = 0;

        // int count = 0;
        // do {
        //     System.out.println("Número: ");
        //     numero = scan.nextInt();

        //     soma = soma + numero;

        //     if (numero > maior) maior = numero;

        //     count = count + 1;
        // } while(count < 5);

        // System.out.println("Maior: " + maior);
        // System.out.println("Média: " + (soma/5));

    }
}
