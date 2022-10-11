package edu.wesley.aprendendoasintaxejava.operadores;

public class _3_4$Concatenacao {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("\n" + nomeCompleto+"\n");

        String concatenacao = "?";
        System.out.println("1. " + concatenacao+"\n");

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("2. " + concatenacao+"\n");

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("3. " + concatenacao+"\n");

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("4. " + concatenacao+"\n");

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("5. " + concatenacao+"\n");

        concatenacao = "1" + (1 + 1 + 1); //Utilizando evidência ()
        System.out.println("6. " + concatenacao+"\n");
    }
}
