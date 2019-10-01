
package Atividade5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class tThread extends Thread {

    Barreira barreira;
    String name;

    public tThread(Barreira b, String name) {
        this.barreira = b;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            barreira.increment(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
