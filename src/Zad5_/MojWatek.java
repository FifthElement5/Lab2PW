package Zad5_;

import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MojWatek extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " index " + i);

        }
        try {
            Random random = new Random();
            int liczba = random.nextInt(20);
            TimeUnit.SECONDS.sleep(liczba);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}


