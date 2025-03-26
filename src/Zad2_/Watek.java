package Zad2_;
import java.lang.Thread;

public class Watek implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+ " " +i);

            try {
                if(Thread.currentThread().getName().contains("Watek_1")) {
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
