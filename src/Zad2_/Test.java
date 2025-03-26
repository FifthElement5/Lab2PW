package Zad2_;

public class Test {
    public static void main(String[] args) {
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.setName("Watek.1");
        t2.setName("***Watek_2");
        t3.setName("## Watek_3");

        //dzialanie programu nigdy nie jest takie samo. Powod: brak synchronizacji,
        //zarzadzam=nie przez JVM, OS; rozne zasoby systemowe

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Koniec programu");
        // "Koniec programu" drukuje się na początku, ponieważ główny wątek (main) nie czeka na zakończenie wątków,
        //tylko przechodzi do następnej linii od razu po uruchomieniu ich.
    }
}
