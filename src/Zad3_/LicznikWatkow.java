package Zad3_;

import java.util.concurrent.TimeUnit;

public class LicznikWatkow {
    private int wartoscKrytyczna;

    public synchronized int policzMnie() {
        wartoscKrytyczna += 1;
        try {
            // Możesz użyć jednej z tych opcji:
            Thread.sleep(100); // 100 milisekund
            // Lub:
            // TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Przywrócenie flagi interrupted
            System.err.println("Wątek został przerwany podczas snu");
        }
        wartoscKrytyczna --;
        return wartoscKrytyczna;
    }
}
