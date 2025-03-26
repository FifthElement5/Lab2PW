package Zad2_;
import java.lang.Thread;

public class Watek implements Runnable {
    public void run() {
        if (Thread.currentThread().getName().contains("Watek.1")) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "[clasa: licznik] " + i);

            }
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + "l12 " + i);
            }
        }
    }
}
