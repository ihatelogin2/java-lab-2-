package zad1;

public class zad2 {
    public static void main(String[] args) {
        int tab[] = new int[5];
        tab[0]=5;
        tab[1]=1;
        tab[2]=2;
        tab[3]=14;
        tab[4]=7;
        int i =0;
        while(i<=tab.length-1){
            System.out.println(tab[i]);
            i++;
        }

        double tab2[] = new double[5];
        tab2[0]= 2.0;
        tab2[1]= 3.0;
        tab2[2]= 5.5;
        tab2[3]= 2.5;
        tab2[4]= 15.2;
        int i2 = 0;
        while(i2<=tab2.length-1){
            System.out.println(tab2[i2]);
            i2++;
        }

        String tab3[] = new String[5];
        tab3[0] = "0";
        tab3[1] = "a";
        tab3[2] = "b";
        tab3[3] = "c";
        tab3[4] = "d";
        int i3 =0;
        while(i3<=tab3.length-1){
            System.out.println(tab3[i3]);
            i3++;
        }


    }
}
