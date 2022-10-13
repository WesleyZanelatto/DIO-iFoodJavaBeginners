package edu.wesley.aprendendoasintaxejava._4_operadores;

public class _3_Aritmeticos {
    public static void main(String[] args) {
        /*
         * O operador aritmético, é utilizado para realizar operações matemáticas entre
         * valores numéricos, podendo se tornar ou não uma expressão mais complexa.
         * Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
         */
        
         //Classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //Resto da Divisão
        double resultado = (10 * 7) + (20 / 4);

        System.out.println("\nSoma = " + soma);
        System.out.println("Subtração = " + subtração);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Modulo = " + modulo);
        System.out.println("Resultado = " + resultado);

        // OBS: ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo
        // texto, realizará a “concatenação de textos”.
    }
}
