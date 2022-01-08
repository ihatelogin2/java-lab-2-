package zad5;

public class zad3 {
    public static void main(String[] args) {
        PodpunktA("Kacper","Bury",21);

    }

    public static void PodpunktA(String imię){
        imię = "KACPER";
        System.out.println(imię);
    }
    public static void PodpunktA(String imię, String nazwisko){
        PodpunktA("Kacper");
        nazwisko="Bury";
        System.out.println(nazwisko);
    }
    public static void PodpunktA(String imię, String nazwisko, int wiek){
        PodpunktA("Kacper", "Bury");
        wiek=21;
        System.out.println(imię+ nazwisko + wiek);
    }
}

