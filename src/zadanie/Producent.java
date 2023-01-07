package zadanie;

public class Producent extends Thread {
    private Bufor buf;
    private int number;
    private String tekst;


    public Producent(Bufor c, int number, String tekst) {
        buf = c;
        this.number = number;
        this.tekst = tekst;
    }


    public void run() {
        synchronized (buf) {

            buf.put(tekst);
            System.out.println("Producer #" +
                    this.number + " put: " + tekst);

            try {
                buf.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
