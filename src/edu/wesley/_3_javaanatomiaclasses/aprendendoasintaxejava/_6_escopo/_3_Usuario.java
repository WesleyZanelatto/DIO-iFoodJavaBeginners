package edu.wesley._3_javaanatomiaclasses.aprendendoasintaxejava._6_escopo;

import java.util.Scanner;

public class _3_Usuario {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        _2_Conta conta = new _2_Conta();

        //Verificando Saldo
        conta.imprimirSaldo();
        
        System.out.println("Digite o valor a ser depositado: ");
        double valor = ler.nextDouble();
        conta.deposito(valor);

        //Verificando Saldo
        conta.imprimirSaldo();
    }
}
