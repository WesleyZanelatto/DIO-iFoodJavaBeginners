package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._4_operadores;

public class _4_Concatenacao {
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

        concatenacao = "1" + (1 + 1 + 1); //Utilizando evidĂȘncia ()
        System.out.println("6. " + concatenacao+"\n");
    }
}
