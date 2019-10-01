package Atividade3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class tThreads extends Thread {

    Mutex mu;
    String name;

    public tThreads(Mutex m, String name) {
        this.mu = m;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            this.mu.increment(this.name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
