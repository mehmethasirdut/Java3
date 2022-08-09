package Gun33.BigWorks1;

import java.util.Scanner;

public class work9 {
    public static void main(String[] args) {
        /*
        9- Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse
        true değerini yazdırınız.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
        sameFirstLast([1]) → true
        sadece true veya false print ediniz.
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
        if (dizi.length==1||dizi[0]==dizi[dizi.length-1])
            System.out.println(true);
        else System.out.println(false);
    }
}
