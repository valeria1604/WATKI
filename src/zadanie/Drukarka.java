package zadanie;

import zadanie.Bufor;

public class Drukarka extends Thread {
    private Bufor buf;

    public Producent producent;

    public Drukarka(Bufor c) {
        buf = c;
    }

    public void run() {
        synchronized (buf) {
            String tekst = null;
            for (int i = 0; i < 3; i++) {
                tekst = buf.get();
                System.out.println("Drukarka got: " + tekst);
            }
            buf.notify();
        }
    }
}
