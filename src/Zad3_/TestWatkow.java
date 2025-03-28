package Zad3_; // Określenie pakietu, w którym znajduje się klasa

public class TestWatkow {
    public static void main(String[] args) {
        // Pobranie liczby wątków z argumentów wejściowych
//        int tnum = Integer.parseInt(args[0]); // liczba wątków
//        int count = Integer.parseInt(args[1]); // liczba powtórzeń pętli w run()

        int tnum = 8; // liczba wątków
        int count = 20; // liczba powtórzeń pętli w run()

        // Tworzymy obiekt klasy LicznikWatkow (który prawdopodobnie przechowuje stan licznika)
        LicznikWatkow licznik = new LicznikWatkow();

        // Tworzymy tablicę wątków
        WatekLiczacy[] thread = new WatekLiczacy[tnum];

        // Tworzymy i uruchamiamy wątki
        for (int i = 0; i < tnum; i++)
            thread[i] = new WatekLiczacy("Watek" + (i + 1), licznik, count);

        // Czekamy na zakończenie wszystkich wątków
        try {
            for (int i = 0; i < tnum; i++) {
                thread[i].join(); // join() sprawia, że główny wątek czeka na zakończenie danego wątku
            }
        } catch (InterruptedException exc) {
            System.exit(1); // Jeśli wystąpi błąd, kończymy program
        }
//      LicznikWatkow licznik = new LicznikWatkow();
//      int wynik = licznik.policzMnie();
//      System.out.println("wynik pojedynczy: "+ wynik);
//
//      WatekLiczacy licze = new WatekLiczacy("watek-test", licznik, 100);
//      System.out.println(licze);

        System.out.println("Koniec programu"); // Wypisujemy informację o zakończeniu programu
    }
}
