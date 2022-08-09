package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class odev200522 {
    public static void main(String[] args) {

    // 1- 4 elemanlı bir dizi tanımlayınız değerleri kullanıcan alınız. Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[4];
        for (int i=0;i<dizi.length;i++){
            System.out.println("dizinin "+(i+1)+". değerini giriniz");
            dizi[i]=oku.nextInt();
        }

        int enk=dizi[0];
        for (int i=0;i< dizi.length;i++)
            if (dizi[i]<enk)
                enk=dizi[i];

        int enb=dizi[0];
        for (int i=0;i<dizi.length;i++)
            if (dizi[i]>enb)
                enb=dizi[i];

        System.out.println("girilen dizinin en büyük ve en küçük değerleri arasındaki fark: "+(enb-enk));

        // 2-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
        //
        //     sonrasında bütün RAKAMLARI toplayıp toplam para değerini bulunuz.


        Scanner oku1=new Scanner(System.in);
        String[][] dizi1=new String[2][3];

        int toplam=0;

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println((i + 1) + ". satırın " + (j + 1) + ". sütununu $22 veya $30 şeklinde giriniz");
                dizi1[i][j]=oku1.nextLine();
                toplam+=Integer.parseInt(dizi1[i][j].substring(1));
            }
        }

    }
}
