package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._8_javadoc;

public class _4_TiposDeComentarios {
    //*Uma linha
        // Olá, eu sou um comentário em uma única linha

    //*Multiplas linhas
        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */

    //*Nível de documentação
        /** 
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */

    //  OBS: Um comentário, não possui a finalidade de amenizar um algoritmo não estruturado, 
    //  conforme as convenções da linguagem. 


    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */    
    
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

}
