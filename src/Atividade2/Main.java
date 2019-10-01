/*
 * Enviar sinalização para um ponto de encontro entre threads.
 * Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 
 * e vice-versa.
 */
package Atividade2;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        Rendezvous r = new Rendezvous();
        r.init();
    }
}
