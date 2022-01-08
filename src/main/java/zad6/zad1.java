package zad6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();
        String zwierze;
        int i=0;
        while(i <= 5) {
            System.out.print("Podaj kolejne zwierze: ");
            zwierze = scanner.nextLine();
            stringList.add(zwierze);
            i++;
        }
        System.out.println("Lista zwierzat:");
        wyswietlZwierzeta(stringList);

        stringList.remove(4);
        stringList.remove(3);
        System.out.println("Zwierzęta po usunięciu:");
        wyswietlZwierzeta(stringList);
        System.out.println("Rozmiar po usunieciu: " + stringList.size());

        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("Sortowanie odwrotne: ");
        wyswietlZwierzeta(stringList);



    }
    public static void wyswietlZwierzeta(List<String> stringList){
        for (String nazwa : stringList) {
            System.out.println(nazwa);
        }
    }

}


