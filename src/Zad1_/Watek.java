package Zad1_;
import java.lang.Thread;

public class Watek extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ",clasa:[ licznik ]" + i);

            try {
                if(Thread.currentThread().getName().contains("Watek.1")) {

                        Thread.sleep(1000);
                        /*dodanie opoznina powoduje opoznienie watku 1, dla kazdej jego iteracji,
                         program drukuje kazda iteracje watku na ekranie z takim opznieniem */
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }



    }
}
