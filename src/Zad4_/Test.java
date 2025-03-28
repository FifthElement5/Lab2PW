package Zad4_;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = sc.nextInt();
        sc.close();

        if (liczba < 16) {
            Silnia silnia = new Silnia();
            for (int i = 0; i < liczba; i++) {
                Silnia.Watek watek = silnia.new Watek();  // JAWNE wskazanie Silnia.Watek
                watek.silnia = silnia;
                watek.liczba = liczba;
                watek.start();
            }
        } else {
            System.out.println("Licze max do !15");
        }
    }
}
