package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;

/**
    * <h1>Exercício 2</h1>
    * Faça um programa que peça uma nota, entre zero e dez.
    * Mostre uma mensagem caso o valor seja inválido e continue pedindo
    * até que o usuário informe um valor válido.
    * <p>
    * <b>Note:</b> Sempre leia atentamente a documentação!
    *
    * @author  Wesley Zanelatto
    * @version 2.0
    * @since   20/10/2022
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);

        int nota;

        System.out.printf("Digite uma Nota: ");
        nota=ler.nextInt();  

        while(nota<0 || nota>10){
            System.out.println("Nota Inválida! Digite novamente: ");  
            nota=ler.nextInt();   
        }
        
    }
}
