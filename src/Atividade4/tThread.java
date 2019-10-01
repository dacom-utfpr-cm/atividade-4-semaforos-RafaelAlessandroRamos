
package Atividade4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
 public class tThread extends Thread {

    Multiplex mu;
    String name;

    public tThread(Multiplex m, String name) {
        this.mu = m;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {            
            this.mu.increments(this.name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
