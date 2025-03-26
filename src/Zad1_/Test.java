package Zad1_;

public class Test {
    public static void main(String[] args) {
        System.out.println("poczatke progarmu");
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();

        w1.setName("Watek.1");
        w2.setName("main [*** Watek 2]");
        w3.setName("main [###Watek 3]");

        //dzialanie programu nigdy nie jest takie samo. Powod: brak synchronizacji,
        //zarzadzam=nie przez JVM, OS; rozne zasoby systemowe
        w1.start();
        w2.start();
        w3.start();

        System.out.println("Koniec programu");
        // "Koniec programu" drukuje się na początku, ponieważ główny wątek (main) nie czeka na zakończenie wątków,
        //tylko przechodzi do następnej linii od razu po uruchomieniu ich
    }
}
