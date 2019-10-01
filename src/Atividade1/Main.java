/*
 * Enviar sinal para outra thread para indicar que um evento ocorreu.
 * Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, 
 * mas a t2 pode somente continuar a execução após a sinalização de t1.
 */
package Atividade1;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        Sinalizacao atividade1 = new Sinalizacao();
        atividade1.init();
    }
}
