package Zad5_;

public class TestZad5 {
    public static void main(String[] args) {
        MojWatek w1 = new MojWatek();
        MojWatek w2 = new MojWatek();
        MojWatek w3 = new MojWatek();
        MojWatek w4 = new MojWatek();
        MojWatek w5 = new MojWatek();

        w1.setName("*W1");
        w2.setName("**W2");
        w3.setName("***W3");
        w4.setName("****W4");
        w5.setName("*****W5");


// watki uruchamiaja sie chaotycznie
//        w1.start();
//        w2.start();
//        w3.start();
//        w4.start();
//        w5.start();

        // Uruchamiamy wątki w odwrotnej kolejności
        try {
            w5.start();
            w5.join(); // Czekamy na zakończenie wątku 5

            w4.start();
            w4.join(); // Czekamy na zakończenie wątku 4

            w3.start();
            w3.join(); // Czekamy na zakończenie wątku 3

            w2.start();
            w2.join(); // Czekamy na zakończenie wątku 2

            w1.start();
            w1.join(); // Czekamy na zakończenie wątku 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Koniec programu");


    }
}
