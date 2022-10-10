package edu.wesley.aprendendoasintaxejava.tiposevariaveis;

public class _3_1_TiposVariaveis {
    public static void main (String[] args){

        //Link: https://glysns.gitbook.io/java-basico/sintaxe/variaveis
        /* Peculiaridades a trabalhar com alguns tipos específicos:
            *byte idade = 123;
		    *short ano = 2021;
		    *int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, nesse caso poderiamos
                                  utilizar o tipo String para solucionar este problema.
		    *long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, nesse caso 
                                        poderiamos utilizar o tipo String para solucionar este problema e
                                        Caso não utilizar o "L ou l" no final pode ocorrer algum erro na compilação
		    *float pi = 3.14F; //Caso não utilizar o "F ou f" no final pode ocorrer algum erro na compilação
		    *double salario = 1275.33;
            *OBS: O tipo long precisa terminar com L, o tipo float precisa terminar com F 
            e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.
        */

        double salarioMinimo1 = 2500.33; // Dois mil e quinhentos reais e trinta e três centavos
        double salarioMinimo2 = 2.500; //Dois reais e cinquenta centavos

        System.out.println("R$ " + salarioMinimo1 + "\nR$ " + salarioMinimo2);

        //Java é fortemente tipado, portanto, segue o exemplo abaixo
        // short numeroCurto = 1;
        // int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; //Nesse caso impossivel converter int em short
        // Caso isso ocorra podemos resolver com casting, ou seja:
        // short numeroCurto2 = (short) numeroNormal;

    }
}
