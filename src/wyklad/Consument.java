package wyklad;

public class Consument extends Thread {
    private Bufor buf;
    private int number;

    public Consument(Bufor c, int number) {
        buf = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = buf.get();
            System.out.println("Printer #" +
                    this.number + " got: " + value);
        }
    }
}
