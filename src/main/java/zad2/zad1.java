package zad2;

public class zad1 {
    public static void main(String[] args) {
        int ostatniaIndeksu = 1;
        for (int i = 100; i > 0 ; i--) {
            if (i%ostatniaIndeksu==0){
                System.out.println(i);
            }
        }
    }
}

