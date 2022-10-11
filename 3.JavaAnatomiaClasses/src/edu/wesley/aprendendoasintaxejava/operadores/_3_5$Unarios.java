package edu.wesley.aprendendoasintaxejava.operadores;

public class _3_5$Unarios {
    public static void main(String[] args) {
        /*
         * Esses operadores, são aplicados juntamente com um outro operador aritmético.
         * Eles realizam alguns trabalhos básicos como incrementar, decrementar,
         * inverter valores numéricos e booleanos.
         * (+) Operador unário de valor positivo – números são positivos sem esse
         * operador explicitamente;
         * (-) Operador unário de valor negativo – nega um número ou expressão
         * aritmética;
         * (++) Operador unário de incremento de valor – incrementa o valor em 1
         * unidade;
         * (--) Operador unário de decremento de valor – decrementa o valor em 1
         * unidade;
         * (!) Operador unário lógico de negação – nega o valor de uma expressão
         * booleana.
         */

        // **Muito cuidado com ordem de precedência, dos operadores unários!**

        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        //OBS: Caso tenhamos um número negativo e precisamos deixa-lo positivo, 
        //basta multiplicar o mesmo por -1
    }
}
