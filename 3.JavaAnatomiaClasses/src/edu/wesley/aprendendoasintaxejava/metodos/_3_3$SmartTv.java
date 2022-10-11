package edu.wesley.aprendendoasintaxejava.metodos;

import java.util.Scanner;

public class _3_3$SmartTv {
        /*
         * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
         
         * 1.Ela tenha as características: ligada (boolean), canal (int) e volume (int);
         * 2.Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
         * 3.Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
         * 4.Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
         */

        // Criando Atributos/Características
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        //Criando Métodos/Ações

        //Criando método Ligar
        public void ligar() {
            ligada = true;
        }

        //Criando método Desligar
        public void desligar() {
            ligada = false;
        }

        //Criando método aumentar volume
        public void aumentarVolume () {
            volume++;
        }

        //Criando método diminuir volume
        public void diminuirVolume () {
            volume--;
        }

        //Criando método aumentar canal
        public void aumentarCanal () {
            canal++;
        }
        //Criando método diminuir canal
        public void diminuirCanal () {
            canal--;
        }
        //Criando método mudar canal 
        public void mudarCanal (int novoCanal) {
               canal = novoCanal;
        }
    }
