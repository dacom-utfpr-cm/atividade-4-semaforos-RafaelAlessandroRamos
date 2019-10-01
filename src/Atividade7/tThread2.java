
package Atividade7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
class tThread2 extends Thread {

    Fila f;
    String name;

    public tThread2(Fila f, String name) {
        this.f = f;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            f.semaphore2(name);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}