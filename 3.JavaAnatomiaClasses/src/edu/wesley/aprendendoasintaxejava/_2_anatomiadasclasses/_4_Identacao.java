package edu.wesley.aprendendoasintaxejava._2_anatomiadasclasses;
public class _4_Identacao {
    public static void main(String[] args) {

        /*
         Indentação (indentation) --> Atalho: Shift+Alt+F
         Basicamente indentar é um termo utilizado para escrever o código do programa
         de forma hierárquica, facilitando assim a visualização e o entendimento do programa.
         */

        /*//Código não Identado 
        int mediaFinal = 6;
        if(mediaFinal<6)	
        System.out.println("REPROVADO"); 
        else if(mediaFinal==6)
        System.out.println("PROVA MINERVA"); 
        else
        System.out.println("APROVADO");
        */

        //Código Identado
        int mediaFinal = 7;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
    }
}
