package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._4_operadores;

public class _9_Logicos {
    public static void main(String[] args) {
        /*
         * Os operadores lógicos, representam o recurso que nos permite criar expressões
         * lógicas maiores, a partir da junção de duas ou mais expressões.
         * && Operador Lógico "E"
         * || Operador Lógico "OU"
         */

        // Operadores.java
        boolean condicao1 = false;
        boolean condicao2 = true;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.print("\nOs dois valores precisam ser verdadeiros");

          // String teste =  (condicao1 && (7>4)) ? "1.Verdadeiro" : "1.Falso";
           System.out.println((condicao1 && (7>4)) ? "\n1.Verdadeiro" : "\n1.Falso");
        

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("\nUm dos valores precisa ser verdadeiro");
    }
}
