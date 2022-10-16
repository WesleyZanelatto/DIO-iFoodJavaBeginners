package edu.wesley._4_logicacondicionalcontroledefluxos._3_controledefluxo;

import java.util.Scanner;

/**
 * <h1>Controle de Fluxo</h1>
 * São estruturas que tem a capacidade de direcionar o fluxo de execução do
 * código.
 * <p>
 * <b>Seus tipos são:</b>
 * <p>
 * <b>Decisão:</b> if(se), if-else(se-então), if-else-if(se-então-se),
 * switch(mes) e operador ternário '(condição) ? "valor se for verdareiro" :
 * "valor se for falso");'
 * <p>
 * Exemplo de operador ternário: OBS:NÃO É MUITO UTILIZADO!
 * <p>
 * double salario = 1000;
 * <p>
 * double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
 * <p>
 * System.out.println(bonus);
 * <p>
 * Nesse caso o salário não é maior que 1000, portanto, salário*0.15 = 150.0
 * <p>
 * <b>Repetição:</b> for, while, do while;
 * <p>
 * <b>Interrupção:</b> break, continue e return.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação!
 *
 * @author Wesley Zanelatto
 * @version 1.0
 * @since 15/10/2022
 */

public class _1_ControleDeFluxo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // /* Com if, exiba o nome do mês do ano de acordo com seu numero, e se o mês
        // for
        // Janeiro, Julho ou Dezembro exiba Férias */
        // // //Utilizando estrutura if-else-if
        // int mes = 0;

        // System.out.println("Escolha um número entre: 1 e 12");
        // mes = ler.nextInt();

        // if (mes == 1) {
        // System.out.printf("Janeiro");
        // } else if (mes == 2) {
        // System.out.printf("Fevereiro");
        // } else if (mes == 3) {
        // System.out.printf("Março");
        // } else if (mes == 4) {
        // System.out.printf("Abril");
        // } else if (mes == 5) {
        // System.out.printf("Maio");
        // } else if (mes == 6) {
        // System.out.printf("Junho");
        // } else if (mes == 7) {
        // System.out.printf("Julho");
        // } else if (mes == 8) {
        // System.out.printf("Agosto");
        // } else if (mes == 9) {
        // System.out.printf("Setembro");
        // } else if (mes == 10) {
        // System.out.printf("Outubro");
        // } else if (mes == 11) {
        // System.out.printf("Novembro");
        // } else if (mes == 12) {
        // System.out.printf("Dezembro");
        // } else {
        // System.out.println("Tente novamente escolhendo um número entre 1 e 12");
        // }

        // if (mes == 7 || mes == 12 || mes == 1) {
        // System.out.printf(" - Férias");
        // }

        /******************************************************************************************* */
        /* Com switch, exiba "Férias" se o mês for Janeiro, Julho ou Dezembro, para demais meses
        exibir mê indefinido*/
        // String mes;

        // System.out.println("Digite um mês ");
        // mes = ler.nextLine().toUpperCase();

        // switch (mes) {
        //     case "JANEIRO":
        //     case "JULHO":
        //     case "DEZEMBRO":
        //         System.out.println("Férias");
        //         break;
        //     default:
        //         System.out.println("Mês Indefinido");
        //         break;

        // }

        // *************************************************************************************************
        // */
        /*
         * Com switch, exiba o nome do mês do ano de acordo com seu numero, e se o mês
         * for
         * Janeiro, Julho ou Dezembro exiba Férias
         */
        // //Utilizando estrutura switch
        // int mes=0;

        // System.out.println("Escolha um número entre: 1 e 12" );
        // mes=ler.nextInt();

        // switch(mes){
        // case 1: System.out.printf("Janeiro");
        // break;
        // case 2: System.out.printf("Fevereiro");
        // break;
        // case 3: System.out.printf("Março");
        // break;
        // case 4: System.out.printf("Abril");
        // break;
        // case 5: System.out.printf("Maio");
        // break;
        // case 6: System.out.printf("Junho");
        // break;
        // case 7: System.out.printf("Julho");
        // break;
        // case 8: System.out.printf("Agosto");
        // break;
        // case 9: System.out.printf("Setembro");
        // break;
        // case 10: System.out.printf("Outubro");
        // break;
        // case 11: System.out.printf("Novembro");
        // break;
        // case 12: System.out.printf("Dezembro");
        // break;
        // default:System.out.println("Tente novamente escolhendo um número entre 1 e
        // 12");
        // break;
        // }

        // if(mes==7 || mes==12 || mes==1){
        // System.out.printf(" - Férias");
        // }
        // }

        // ****************************************************************************************
        // */
        /* Com switch use String para a partir do dia da semana, exibir seu número */

        // String diaDaSemana;

        // System.out.println("Escolha um dia da semana! Ex: segunda, domingo...");
        // diaDaSemana = ler.nextLine().toLowerCase();

        // switch (diaDaSemana) {
        // case "domingo":
        // System.out.println(1);
        // break;
        // case "segunda":
        // System.out.println(2);
        // break;
        // case "terça":
        // System.out.println(3);
        // break;
        // case "quarta":
        // System.out.println(4);
        // break;
        // case "quinta":
        // System.out.println(5);
        // break;
        // case "sexta":
        // System.out.println(6);
        // break;
        // case "sabado":
        // System.out.println(7);
        // break;

        // default:
        // System.out.println("Dia inválido");
        // break;
        // }

        // ***************************************************************************************
        // */
        /*
         * Com switch faça uma variável inteira entre 1 e 3 exibir o texto "Certo", se
         * for 4 exibir
         * "Errado", se for 5 "Talvez" e para demais valores inteiros exibir
         * "Valor indefinido".
         */
        // int numero = 0;

        // System.out.printf("\nDigite um número inteiro: ");
        // numero = ler.nextInt();

        // switch (numero) {
        // case 1:
        // case 2:
        // case 3:
        // System.out.println("Certo");
        // break;
        // case 4:
        // System.out.println("Errado");
        // break;
        // case 5:
        // System.out.println("Talvez");
        // break;

        // default:
        // System.out.println("Valor Indefinido");
        // break;
        // }

    }
}
