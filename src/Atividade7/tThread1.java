
package Atividade7;

/**
 *
 * @author rafael
 */
class tThread1 extends Thread {

    Fila f;
    String name;

    public tThread1(Fila f, String name) {
        this.f = f;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            f.semaphore1(name);
        }
    }
}
