/*
 * Após n threads sincronizarem em um ponto em comum, um trecho específico 
 * (ponto crítico) pode ser executado por cada uma delas.
 * Faça um código que possibilite barrar N threads em um ponto específico de 
 * execução e, após todas alcançarem o ponto, todas devem executar o trecho 
 * de código após esse ponto.
 */
package Atividade5;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        Barreira b = new Barreira(9, 5);
        b.init();
    }
}
