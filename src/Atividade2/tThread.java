package Atividade2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class tThread extends Thread {

    Rendezvous ren;
    String name;
    int trecho;

    public tThread(Rendezvous r, String name) {
        this.ren = r;
        this.trecho = 0;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            this.trecho += 1;
            ren.trecho("Trecho" + this.name + "." + this.trecho);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
