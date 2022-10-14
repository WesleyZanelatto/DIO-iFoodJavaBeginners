package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._4_operadores;

import java.util.Date;

public class _2_Atribuicao {
    public static void main(String[] args) {
        /*
         * Representado pelo símbolo de igualdade "=".
         * O operador de atribuição é utilizado para definir o valor inicial ou
         * sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e
         * opcionalmente atribuímos um valor à variável através do operador de
         * atribuição. Exemplos abaixo:
         */

        String nome = "WESLEY"; // Aspas dupla
        int idade = 37;
        double peso = 71.2;
        char sexo = 'M'; // Aspas simples
        boolean doadorOrgao = false; // ou true para verdadeiro
        Date dataCadastro = new Date(); //Instanciando um Objeto

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador de Orgãos: " + doadorOrgao);
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}
