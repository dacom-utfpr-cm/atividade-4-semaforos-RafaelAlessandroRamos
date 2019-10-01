package Atividade4;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Multiplex {

    Semaphore semaphore;
    int nThreads;
    int count;

    public Multiplex(int sizeSemaphoro, int numThreads) {
        this.semaphore = new Semaphore(sizeSemaphoro);
        this.nThreads = numThreads;
        this.count = 0;
    }

    public void increments(String name) {
        try {
            this.semaphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Multiplex.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.count++;
        System.out.println(name + "|Contador: " + this.count);
        this.semaphore.release();
    }

    public void init() {
        for (int i = 0; i < this.nThreads; i++) {
            tThread thread = new tThread(this, "Thread" + i);
            thread.start();
        }
    }

}
