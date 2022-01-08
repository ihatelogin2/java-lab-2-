package zad5;

public class zad1 {
    public static void main(String[] args) {
        PodpunktB();
        PodpunktC();
    }


    public static int[] PodpunktB() {
        int[] tab = new int[20];
        int start = 40;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = start;
            start--;
        }
        return tab;
    }

    public static void PodpunktC(){
        int tab[]=PodpunktB();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

}
