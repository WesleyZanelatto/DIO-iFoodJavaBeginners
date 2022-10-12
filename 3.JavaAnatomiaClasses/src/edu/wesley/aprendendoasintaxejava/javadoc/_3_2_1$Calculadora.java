package edu.wesley.aprendendoasintaxejava.javadoc;
/**
    * <h1>Calculadora</h1>
    * A Calculadora realiza operações matemáticas entre números inteiros
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classes
    * para desfrutar dos recursos oferecidos pelo autor
    *
    * @author  Wesley Zanelatto
    * @version 1.0
    * @since   12/10/2022
*/

//Colocar a seta de navegação do mouse em cima do nome da Classe para mostrar as informações.
public class _3_2_1$Calculadora {
        
     /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
        //Colocar a seta de navegação do mouse em cima do nome do Método para mostrar as informações.
        public int somar(int numeroUm, int numeroDois) {
            return  numeroUm + numeroDois;
        }

        //Gerando documentação
        /*javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docscalculadora src/edu/wesley/
        aprendendoasintaxejava/javadoc/_3_2_1$Calculadora.java
        
        OBS: -d ../docscalculadora (é o local que iremos criar uma nova pasta para a documentação);

             src/edu/wesley/aprendendoasintaxejava/javadoc/_3_2_1$Calculadora.java (é o local com o 
             arquivo específico que iremos gerar a documentação, nesse caso iremos gerar a documentação 
             do arquivo _3_2_1$Calculadora.java).
        */

}
