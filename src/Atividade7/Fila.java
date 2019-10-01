
package Atividade7;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Fila {

    Semaphore s1;
    Semaphore s2;
    int nThreads1;
    int nThreads2;
    String concat;
    boolean hasThread2;

    public Fila(int nThreads1, int nThreads2) {
        this.s1 = new Semaphore(0);
        this.s2 = new Semaphore(0);
        this.nThreads1 = nThreads1;
        this.nThreads2 = nThreads2;
        this.hasThread2 = false;
    }

    public void semaphore1(String message) {
        this.s2.release();
        try {
            this.s1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(message + "|" + this.concat);
        this.concat = "";
    }

    public void semaphore2(String message) {
        this.s1.release();
        try {
            this.s2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.concat = message;
    }

    public void init() {
        for (int i = 0; i < this.nThreads1; i++) {
            tThread1 thread1 = new tThread1(this, "Fila01 (id:" + i + ")");
            thread1.start();
        }

        for (int i = 0; i < this.nThreads2; i++) {
            tThread2 thread2 = new tThread2(this, "Fila02 (id:" + i + ")");
            thread2.start();
        }
    }
}