package Atividade3;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Mutex {

    int count;
    Semaphore semaphore;
    tThreads t1;
    tThreads t2;
    tThreads t3;

    public Mutex() {
        this.count = 0;
        this.semaphore = new Semaphore(1);

        this.t1 = new tThreads(this, "t1");
        this.t2 = new tThreads(this, "t2");
        this.t3 = new tThreads(this, "t3");
    }

    public void increment(String name) {
        try {
            this.semaphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mutex.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.count++;
        System.out.println(name + " Contador: " + this.count);
        this.semaphore.release();
    }

    public void init() {
        this.t1.start();
        this.t2.start();
        this.t3.start();
    }
}
