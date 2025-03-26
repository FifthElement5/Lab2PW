package Zad3_;

public class WatekLiczacy extends Thread {
    private LicznikWatkow licznikWatkow;
    private int count;

    public WatekLiczacy(String name, LicznikWatkow licznikWatkow, int count) {
        super(name);
        this.licznikWatkow = licznikWatkow;
        this.count = count;
        start();

    }

    public void run() {
        int wynik = 0;
        // w petli wielokrotnie wywolujemy metode policzMnie
        // jezeli wynik metody jest rozny od zera - przerywamy dzialanie petli
        for (int i = 0; i < count; i++) {
            wynik = licznikWatkow.policzMnie();
            if (wynik != 0) break;
        }

        // pokazujemy wartosc zmiennej wynik na wyjsciu z metody run()
        System.out.println(Thread.currentThread().getName() + " konczy z wynikiem " + wynik);
    }
}