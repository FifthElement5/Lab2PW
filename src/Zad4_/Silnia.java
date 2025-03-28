package Zad4_;

//import java.util.Scanner;
//public class Silnia {
//    public class Watek extends Thread {
//        public int liczba;
//        public Silnia silnia;
//
//
//
//        @Override
//        public void run() {
//            System.out.println(Thread.
//                    currentThread().getName()
//                    + "[" + liczba
//                    + "] ! = " + silnia.licz(liczba));
//        }
//    }
//
//    // obliczenie silni odbywa się za pomocą rekurencji
//    public synchronized int licz(int wartosc) {
//        try {
//            if (wartosc <= 1)
//                return 1;
//            else
//                return wartosc * licz(wartosc - 1);
//        } finally {
//            System.out.println(Thread.currentThread().getName()
//                    + " ==[liczbe]==> " + wartosc);
//        }
//    }
//}



public class Silnia {
    // Metoda licz() teraz jest PRZED klasą Watek
    public int licz(int wartosc) {
        try {
            if (wartosc <= 1)
                return 1;
            else
                return wartosc * licz(wartosc - 1);
        } finally {
            System.out.println(
                    Thread.currentThread().getName()
                            + " ==[liczbe]==> " + wartosc
            );
        }
    }

    // Klasa Watek po metodzie licz()
    public class Watek extends Thread {
        public int liczba;
        public Silnia silnia;

        @Override
        public void run() {
            System.out.println(
                    Thread.currentThread().getName()
                            + "[" + liczba + "] ! = "
                            + silnia.licz(liczba)  // Tutaj jest wywołanie licz()
            );
        }
    }
}