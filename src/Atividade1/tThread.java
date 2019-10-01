package Atividade1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class tThread extends Thread {

    Sinalizacao sinal;
    String name;

    public tThread(Sinalizacao s, String name) {
        this.sinal = s;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            this.sinal.message(this.name + " Fazendo nada...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(tThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
