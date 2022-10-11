package edu.wesley.aprendendoasintaxejava.metodos;

public class _3_1$criterioNomeacao {
    public static void main(String[] args) {

        /*
         * Métodos
         * Todas as ações das aplicações são consideradas métodos.
         * Uma classe é definida por atributos e métodos. Já vimos que atributos são, em
         * sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por
         * sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas
         * classes.
         * Critério de nomeação de Métodos
         * Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos,
         * pois essas convenções facilitam a vida dos programadores ao trabalharem em
         * códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código
         * mais legível para nós e também para outras pessoas. Para métodos, os
         * critérios são:
         * Deve ser nomeado como verbo;
         * Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da
         * primeira letra da segunda palavra).
         

         * Exemplos sugeridos para nomenclatura de métodos
         */

        somar(int n1, int n2){}

        abrirConexao(){}
        
        concluirProcessamento() {}
        
        findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
        
        calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

        //OBS: ATENÇÃO! Não existe em Java o conceito de métodos globais. Todos os métodos devem 
        //SEMPRE ser definidos dentro de uma classe.
    }
}
