package edu.wesley._4_logicacondicionalcontroledefluxos._2_operadoreslogicos;

/**
    * <h1>Operadores Lógicos</h1>
    * Operadores lógicos é uma classe de operações sobre variáveis ou elementos pré-definidos,
    * resultando determinadas condições/expressões em true ou false.
    * Os operadores lógicos são: E, OU, NÃO, NÃO-E, NÃO-OU, OU-EXCLUSIVO E NÃO-OU-EXCLUSIVO.
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classe
    * para desfrutar dos recursos oferecidos pelo autor.
    *
    * @author  Wesley Zanelatto
    * @version 1.1
    * @since   15/10/2022
*/

public class OperadoresLogicos {
    public static void main (String[] args){
        
        //Declaração de variáveis/atributos
        boolean b1=true, b2=false, b3=true, b4=false;
                
        //Operador Lógico AND(E)
        System.out.println("b1 && b2 --> " + (b1 && b2));
        System.out.println("b1 && b3 --> " + (b1 && b3));

        //Operador Lógico OR(OU)
        System.out.println("b2 || b3 --> " + (b2 || b3));
        System.out.println("b2 || b4 --> " + (b2 || b4));

        //Operador Lógico XOR
        System.out.println("b1 ^ b3 --> " + (b1 ^ b3));
        System.out.println("b4 ^ b1 --> " + (b4 ^ b1));

        //Operador Lógico Negação
        System.out.println("!b1 --> " + (!b1));
        System.out.println("!b2 --> " + (!b2));    
        
        //Declaração de variáveis/atributos
        float f1=20f,f2=50f;
        int i1=10,i2=5;

        //Operadores Expressões Lógicas, Relacionais e aritméticas
        System.out.println("((i1>i2) || (f2<f1)) --> " + ((i1>i2) || (f2<f1)));
        System.out.println("((i1+i2)<(f2-f1)) && true --> " + (((i1+i2)<(f2-f1)) && true));


        //Exemplo com expressão muito grande

        //Declaração de variáveis/atributos
        int quantidadeDeDependentes=4, mediaDependentes=2;
        double salarioMensal = 11893.58d, mediaSalario=10500d;

        System.out.printf("Linha 55: ");
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDeDependentes >= mediaDependentes));

        //Declaração de variáveis/atributos por atribuição
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDeDependentes >= mediaDependentes;

        System.out.printf("Linha 62: ");
        System.out.println((salarioBaixo) && (muitosDependentes));

        //Declaração de variáveis/atributos por atribuição
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.printf("Linha 68: ");
        System.out.println("recebeAuxilio --> " +  recebeAuxilio);

    }
}
