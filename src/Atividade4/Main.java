/*
 * Garantir acesso à seção crítica para no máximo N threads.
 * Faça um código que possibilite que N threads estejam na seção crítica 
 * simultaneamente.
 */
package Atividade4;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        Multiplex m = new Multiplex(3, 9);
        m.init();
    }
}
