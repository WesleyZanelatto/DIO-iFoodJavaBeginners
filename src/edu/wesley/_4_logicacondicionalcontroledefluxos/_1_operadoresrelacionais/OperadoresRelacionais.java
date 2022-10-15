package edu.wesley._4_logicacondicionalcontroledefluxos._1_operadoresrelacionais;

/**
    * <h1>Operadores Relacionais</h1>
    * Operadores relacionais são utilizados para comparar valores, o resultado de uma expressão 
    * relacional é um valor booleano (VERDADEIRO ou FALSO). Os operadores relacionais são: igual, 
    * diferente, maior, menor, maior ou igual, menor ou igual.
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classe
    * para desfrutar dos recursos oferecidos pelo autor.
    *
    * @author  Wesley Zanelatto
    * @version 1.0
    * @since   15/10/2022
*/

public class OperadoresRelacionais{
    public static void main(String[] args) {
        
        int i1=10, i2=20;
        float f1=4.5f, f2=3.5f;
        double d1=59.9d;
        char c1='x', c2='y';
        String s1="Fulano", s2="Fulano", s3="Cicrano";
        boolean b1=true, b2=false;
        Long l1=1597l, l2=8997l;
        byte y1=1;
        short sh1=25;

        //Variáveis int
        System.out.println("i1==i2 --> " + (i1==i2)); //Comparadores de Similaridade
        System.out.println("i1!=i2 --> " + (i1!=i2)); //Comparadores de Similaridade
        System.out.println("i1>i2 --> " + (i1>i2)); //Comparadores de tamanho
        System.out.println("i1<=i2 --> " + (i1<=i2));//Comparadores de tamanho
         
        //Variáveis float
        System.out.println("f1==f2 --> " + (f1==f2));
        System.out.println("f1!=f2 --> " + (f1!=f2));
        System.out.println("f1>=f2 --> " + (f1>=f2));
        System.out.println("f1<f2 --> " + (f1<f2));
        
        //Variáveis char
        System.out.println("c1==c2 --> " + (c1==c2));
        System.out.println("c1!=c2 --> " + (c1!=c2));
        System.out.println("c1>=c2 --> " + (c1>=c2));
        System.out.println("c1<=i2 --> " + (c1<=c2));
        
        //Variáveis String
        System.out.println("s1==s2 --> " + (s1==s2));
        System.out.println("s1==s3 --> " + (s1==s3));
        System.out.println("s1!=s2 --> " + (s1!=s2));
       // System.out.println("s1>=s2 --> " + (s1>=s2)); //Vai apresentar erro
       // System.out.println("s1<s2 --> " + (s1<s2)); //Vai apresentar erro
        
        //Variáveis boolean
        System.out.println("b1==b2 --> " + (b1==b2));
        System.out.println("b1!=b2 --> " + (b1!=b2));
       // System.out.println("b1>b2 --> " + (b1>b2)); //Vai apresentar erro
       // System.out.println("b1<=i1 --> " + (b1<=i1)); //Vai apresentar erro
        
        //Variáveis mistas
        System.out.println("i2>f1 --> " + (i2>f1));
        System.out.println("d1==sh1 --> " + (d1==sh1));
      // System.out.println("s2!=c1 --> " + (s2!=c1)); //Vai apresentar erro
      // System.out.println("s3!=i1 --> " + (s3!=i1)); //Vai apresentar erro
        
        System.out.println("l1==i2 --> " + (l1==i2));
        System.out.println("l1>=i1 --> " + (l1>=i1));
        System.out.println("y1!=sh1 --> " + (y1!=sh1));
    }
}