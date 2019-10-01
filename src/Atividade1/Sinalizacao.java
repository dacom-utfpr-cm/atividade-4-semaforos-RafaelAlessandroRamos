
package Atividade1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Sinalizacao {

    Semaphore semaphore;
    tThread thread1;
    tThread thread2;

    public Sinalizacao() {
        this.semaphore = new Semaphore(1);
        this.thread1 = new tThread(this, "t1");
        this.thread2 = new tThread(this, "t2");
    }

    public void message(String message) {
        try {
            this.semaphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Sinalizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(message);
        this.semaphore.release();
    }

    public void init() {
        this.thread1.start();
        this.thread2.start();
    }
}

