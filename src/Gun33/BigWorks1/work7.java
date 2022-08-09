package Gun33.BigWorks1;

import java.util.Arrays;
import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        /*
        7- Verilen int arrayde;
    duplicated(tekrarlanan) öğeleri array den kaldırınız.
    non-duplicated(tekrarlanmayan) öğeleri print ediniz.
    Örnek:
    Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
    result [1,2,3,4,5] olmalı
    NOT: resultu print ederken for loop kullanmayınız.
    System.out.println(Arrays.toString(your_array_name)); kullanınız.
         */

        Scanner read=new Scanner(System.in);
        System.out.print("array kaç elemanlı olsun=");
        int dizilength=read.nextInt();
        int[] dizi=new int[dizilength];

        for (int i=0;i<dizilength;i++){
            System.out.print((i+1)+". eleman=");
            dizi[i]=read.nextInt();
        }
        System.out.println();
        System.out.print("ilk hali="+ Arrays.toString(dizi));
        System.out.println();
        Arrays.sort(dizi);
        System.out.println();
        int sayac=1;
        for (int i=0;i<dizi.length-1;i++) {
            if (dizi[i]!=dizi[i+1])
                sayac++;
        }
        int[] yenidizi=new int[sayac];
        int sayac1=0;
        for (int i=0;i<dizi.length-1;i++) {
            if (dizi[i] != dizi[i + 1]){
                yenidizi[sayac1++] = dizi[i];
            if ((sayac1+1)==sayac)
                yenidizi[sayac-1] = dizi[dizilength-1];}
        }

        System.out.println(Arrays.toString(yenidizi));


    }
}
