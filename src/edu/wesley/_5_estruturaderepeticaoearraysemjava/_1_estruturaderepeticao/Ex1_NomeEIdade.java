package edu.wesley._5_estruturaderepeticaoearraysemjava._1_estruturaderepeticao;

import java.util.Scanner;

/**
    * <h1>Exercício 1</h1>
    * Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
    * e o segundo representando a sua idade.
    * (Pare inserindo o valor 0 no campo nome).
    * <p>
    * <b>Note:</b> Sempre leia atentamente a documentação!
    *
    * @author  Wesley Zanelatto
    * @version 1.0
    * @since   20/10/2022
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = ler.next();
            if (nome.equals("0")) {
                break;}

            System.out.println("Idade: ");
            idade = ler.nextInt();
        }

        System.out.println("Continua aqui...");

    }
    
}
