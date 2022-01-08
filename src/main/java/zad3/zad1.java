package zad3;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę którą sprawdze");
        int i = scanner.nextInt();

        switch (i%7){
            case 0:
                System.out.println("liczba jest podzielna przez 7");
            default:
                System.out.println("nie jest podzielna przez 7");
        }


//        switch (i%2){
        //          case 0:
        //            System.out.println("Ta liczba jest parzysta");
        //          break;
        //    default:
        //      System.out.println("Ta liczba nie jest parzysta");
        //    break;

        //* }
    }
}

