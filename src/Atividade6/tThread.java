package Atividade6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class tThread extends Thread {

    BarreiraReusavel barreira;
    String name;

    public tThread(BarreiraReusavel b, String name) {
        this.barreira = b;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
