package edu.wesley.aprendendoasintaxejava._5_metodos;

import java.util.Scanner;

public class _4_Usuario {
    public static void main(String[] args) {
        
        // Instanciando a classe _3_3$SmartTv para o objeto smartTv
        _3_SmartTv smartTv = new _3_SmartTv(); 

        Scanner ler = new Scanner(System.in);

        // System.out.println("TV Ligada ?" + smartTv.ligada);
        // System.out.println("Canal Atual: " + smartTv.canal);
        // System.out.println("Volume Atual: " + smartTv.volume);

        // smartTv.ligar ();
        // System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        // smartTv.desligar ();
        // System.out.println("Novo Status -> TV Desligada ? " + smartTv.ligada);

        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // System.out.println("Volume Atual: " + smartTv.volume);

        // smartTv.diminuirVolume();
        // System.err.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Digite um canal: ");
        int novoCanal = ler.nextInt();
        smartTv.mudarCanal(novoCanal);
        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
    }
}
