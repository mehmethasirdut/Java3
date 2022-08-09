package Gun33.BigWorks1;

import java.util.Arrays;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        /*
        4- Bir veya daha fazla öğe içeren int array verildiğinde, arraydeki en büyük ve en küçük öğeler
        arasındaki farkı return ediniz.
Not: the built-in Math.min(v1, v2) ve Math.max(v1, v2) methodları en küçük ve en büyük
öğeleri return eder.
bigDiff([10, 3, 5, 6]) → 10-3 result = 7
bigDiff([7, 2, 10, 9]) → 10-2 result = 8
bigDiff([2, 10, 7, 1]) → 10-1 result = 9
return tipi int dir.
         */

        Scanner oku = new Scanner(System.in);
        System.out.print("dizi kaç elemanlı olsun=");
        int dizilength=oku.nextInt();
        int[] dizi=new int[dizilength];
        int sayac=0;
        do {
            System.out.print((sayac+1)+". dizi elemanı=");
            dizi[sayac]=oku.nextInt();
            sayac++;
        }while (sayac<dizilength);
        System.out.println();
        System.out.println("dizi="+Arrays.toString(dizi));

        int max=dizi[0];
        int min=dizi[0];
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]>max)
                max=dizi[i];
            if (dizi[i]<min)
                min=dizi[i];
        }
        System.out.println();
        System.out.println("resault="+(max-min));


    }
}
