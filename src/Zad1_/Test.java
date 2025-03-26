package Zad1_;

public class Test {
    public static void main(String[] args) {
        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();

        w1.setName("main [---Watek.1]");
        w2.setName("main [*** Watek 2]");
        w3.setName("main [###Watek 3]");

        w1.start();
        w2.start();
        w3.start();
    }
}
