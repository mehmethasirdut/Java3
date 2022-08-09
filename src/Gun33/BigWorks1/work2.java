package Gun33.BigWorks1;

import java.util.Arrays;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        /*
        2- String bir array verildiğinde;
Eger String Orange içeriyorsa bütün Orange leri Apple çeviriniz.
Örnek:
Array : Peach , Berry , Orange , WaterMelon , Orange
Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
Arrayi print ediniz.
         */

        Scanner diziOku=new Scanner(System.in);
        String[] dizi=new String[5];
        int sayac=0;
        do{
            System.out.print((sayac+1)+". elemanı giriniz=");
            dizi[sayac]=diziOku.nextLine();

            sayac++;
        }while(sayac<5);

        for (int i=0;i<dizi.length;i++)
            if (dizi[i].equals("Orange"))
                dizi[i]="Apple";

        System.out.println();
        System.out.println(Arrays.toString(dizi));
    }
}
