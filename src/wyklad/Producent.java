package wyklad;

public class Producent extends Thread {
    private Bufor buf;
    private int number;

    public Producent(Bufor c, int number) {
        buf = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buf.put(i);
            System.out.println("Producer #" +
                    this.number + " put: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
