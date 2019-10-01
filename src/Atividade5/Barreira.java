
package Atividade5;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Barreira {

    Semaphore semphore;
    Semaphore mutex;
    int countThreads;
    int sizeW;
    int nThreads;
    int count;

    public Barreira(int numThreads, int sizeWall) {
        this.countThreads = 0;
        this.count = 0;
        this.sizeW = sizeWall;
        this.nThreads = numThreads;

        this.semphore = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }

    public void increment(String message) {
        try {
            this.mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Barreira.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.countThreads++;
        System.out.println("Numero de Threads: " + this.countThreads);
        if (this.countThreads >= sizeW) {
            this.semphore.release();
        }
        this.mutex.release();
        try {
            this.semphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Barreira.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.count++;
        System.out.println(message + " Contador: " + this.count);
    }

    public void init() {
        for (int i = 0; i < this.nThreads; i++) {
            tThread thread = new tThread(this, "Thread" + i);
            thread.start();
        }
    }
}