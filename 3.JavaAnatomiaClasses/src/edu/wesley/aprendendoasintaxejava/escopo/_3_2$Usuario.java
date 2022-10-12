package edu.wesley.aprendendoasintaxejava.escopo;

import java.util.Scanner;

public class _3_2$Usuario {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        _3_2$Conta conta = new _3_2$Conta();

        //Verificando Saldo
        conta.imprimirSaldo();
        
        System.out.println("Digite o valor a ser depositado: ");
        double valor = ler.nextDouble();
        conta.deposito(valor);

        //Verificando Saldo
        conta.imprimirSaldo();
    }
}
