package Gun33.BigWorks2;

import java.util.Arrays;

public class work6 {
    public static void main(String[] args) {
        /*
        6- İnteger array ‘numaralar’ ve integer ‘toplam’ verilmistir.
Verilen array’de toplami, integer ‘toplam’ a esit olan kac cift numara bulunduğunu hesaplayınız.
Örnek:
int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
Int toplam = 6;
Verilen array’de toplami 6 olan çift sayisini bulmalıyız.
Toplami 6 olan ciftler = [1, 5] ve [2, 4] dur. Toplami 6 olan iki adet ciftimiz var.
Result 2 olmali!
         */

        int[] numaralar={1, 9, 5, 14, 2, 0, 4};
        int toplam=6;
        ToplamBul(numaralar,toplam);

    }

    public static void ToplamBul(int[] numaralar, int toplam){

        Arrays.sort(numaralar);

        for (int i=0;i<numaralar.length;i++){

            for (int j=0;j< numaralar.length;j++){
                if (i!=j&&(numaralar[i]+numaralar[j])==toplam){
                    System.out.println("["+numaralar[i]+","+numaralar[j]+"]");
                }
            }
        }


    }
}
