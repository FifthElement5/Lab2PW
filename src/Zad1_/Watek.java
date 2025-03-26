package Zad1_;
import java.lang.Thread;

public class Watek extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ",clasa:[ licznik ]" + i);

            try {
                if(Thread.currentThread().getName().contains("Watek.1")) {

                        Thread.sleep(500);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }



    }
}
