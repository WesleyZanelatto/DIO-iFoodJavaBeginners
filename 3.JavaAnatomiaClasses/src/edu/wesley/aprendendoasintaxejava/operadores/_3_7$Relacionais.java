package edu.wesley.aprendendoasintaxejava.operadores;

public class _3_7$Relacionais {
    public static void main(String[] args) {
        /*
         * Os operadores relacionais, avaliam a relação entre duas variáveis ou
         * expressões. Neste caso, mais precisamente, definem se o operando à esquerda é
         * igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita,
         * retornando um valor booleano como resultado.
         * == Quando desejamos verificar se uma variável é IGUAL A outra.
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         * < Quando desejamos verificar se uma variável é MENOR QUE outra.
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */

         //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("\nnumeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;
        System.out.println("\nnumeroUm é diferente a numeroDois? " + simNao);
        
        if(numero1 > numero2)
            System.out.print("\nNumero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("\nNumero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("\nNumero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("\nNumero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("\nNumero 1 é diferente de numero 2");

            //Comparando objetos
            String nomeUm = "WESLEY";
            String nomeDois = new String("WESLEY");

            System.out.println("\n" + nomeUm.equals(nomeDois)); //equals compara conteúdos
    }
}
