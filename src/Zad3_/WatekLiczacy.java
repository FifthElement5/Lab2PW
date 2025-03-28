package Zad3_;

public class WatekLiczacy extends Thread {

    private LicznikWatkow licznikWatkow;
    private int count;

    public WatekLiczacy(String name, LicznikWatkow licznikWatkow, int count){
        super(name); // wywoluje konstruktor klasy Thread i nadaje watkowi nazwe
        this.licznikWatkow = licznikWatkow; //przypisuje referencke do licznikow
        this.count = count; // wartoisc itrecaji
        start();            // rozpoczecie watku
    }
    public void run() {
        int wynik = 0;
// W pętli wielokrotnie wywołujemy metodę policzMnie()
// Jeżeli wynik metody jest różny od zera - przerywamy działanie pętli
        for (int i = 0; i < count; i++) {
            wynik = licznikWatkow.policzMnie();
            if (wynik != 0) break;
        }
// Pokazujemy wartość zmiennej wynik na wyjściu z metody run()
        System.out.println(Thread.currentThread().getName()
                + " konczy z wynikiem " + wynik);
    }
}