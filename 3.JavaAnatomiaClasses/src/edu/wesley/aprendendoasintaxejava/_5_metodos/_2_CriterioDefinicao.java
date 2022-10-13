package edu.wesley.aprendendoasintaxejava._5_metodos;

public class _3_2$criterioDefinicao {
    public static void main(String[] args) {

        /*
         * Critério de definição de métodos
         * Mas, como sabemos a melhor forma, de definir os métodos das nossas classes?
         * Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural
         * para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:
         * 
         * 1.Qual a proposta principal do método? Você deve se perguntar constantemente
         * até compreender a real finalidade do mesmo.
         * 
         * 2.Qual o tipo de retorno esperado após executar o método? Você deve analisar
         * se
         * o método será responsável por retornar algum valor ou não.
         * 
         * OBS: Caso o método não retorne nenhum valor, ele será representado pela
         * palavra-chave void.
         * 
         * 1.Quais os parâmetros serão necessários para execução do método? Os métodos às
         * vezes precisarão de argumentos como critérios para a execução.
         * 
         * 2.O método possui o risco de apresentar alguma exceção? Exceções são comuns na
         * execução de métodos, as vezes é necessário prever e tratar a possível
         * existência de uma exceção.
         * 
         * 3.Qual a visibilidade do método? Avaliar se será necessário que o método seja
         * visível a toda aplicação, somente em pacotes, através de herança ou somente a
         * nível a própria classe.
         * 
         * Abaixo, temos um exemplo de uma classe com dois métodos e suas respectivas
         * considerações:
         */

        public double somar(int num1, int num2){
            //LOGICA - FINALIDADE DO MÉTODO
            return ... ;
        }
        
        public void imprimir(String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        // throws Exception : indica que o método ao ser utilizado
        // poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception{}
        
        // este método não pode ser visto por outras classes no projeto
        private void metodoPrivado(){}
        
        //alguns equívocos estruturais
        public void validar(){
            //este método deveria retornar algum valor
            //no caso boolean (true ou false)
        }
        public void calcularEnviar(){
            //um método deve representar uma única responsabilidade
        }
        public void gravarCliente(String nome, String cpf, Integer telefone, ....){
            //este método tem a finalidade de gravar
            //informações de um cliente, por que não criar
            //um objeto cliente e passar como parâmetro ?
            //veja abaixo
        }
        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}
    }
}
