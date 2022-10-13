package edu.wesley.aprendendoasintaxejava._8_javadoc;

public class _5_JavaDoc {
    /*
     * Javadoc é um gerador de documentação criado pela Sun Microsystems , para
     * documentar a API dos programas em Java, a partir do código-fonte. O resultado
     * é expresso em HTML. É constituído, basicamente, por algumas marcações muitos
     * simples, inseridas nos comentários do programa.
     * Este sistema, é o padrão de documentação de classes em Java, onde muitas das
     * IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.
     * 
     * LINK: https://pt.wikipedia.org/wiki/Javadoc 
     */

    //Criando nossa documentação no formato html, para disponibilizar via web.
    
    // No terminal execute o comando abaixo
    
    //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

    /*OBS:  -d ../docs (-d significa um diretório a menos do que estamos e é onde iremos criar uma nova 
            pasta chamada docs para armazenar toda a documentação;

            src/*.java (src/ Seria o local onde o arquivo esta para gerar a documentação, ou seja, vai 
            estar na pasta src/ e vai pegar todos* os arquivos com extensão .java, que também pode
            ser um único arquivo específico).
    */
}
