/*
 * Garantir acesso exclusivo à seção crítica.
 * Faça um código que possibilite que 2 ou mais threads realizem o incremento 
 * de um contador. Faça a exclusão mútua com semáforo.
 */
package Atividade3;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        Mutex m = new Mutex();
        m.init();
    }
}
