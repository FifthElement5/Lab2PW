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
        for (int i = 0; i < count; i++) {
        }
    }
}