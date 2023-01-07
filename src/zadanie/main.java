package zadanie;

import zadanie.Bufor;
import zadanie.Drukarka;
import zadanie.Producent;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Bufor bufor = new Bufor();

        Producent p1 = new Producent(bufor, 1, "Imya");
        Producent p2 = new Producent(bufor, 2, "Familiya");
        Drukarka c1 = new Drukarka(bufor);
        p1.start();
        p2.start();
        c1.start();

    }
}
