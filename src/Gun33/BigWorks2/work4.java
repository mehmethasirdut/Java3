package Gun33.BigWorks2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        /*
        4- allNumbers Integer Hashset verildiğinde;
allNumbers hashset'i sort edin,
Sonucu ArrayList olarak değiştirin,
Return ArrayList.
NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMAYINIZ , FOR LOOP VEYA
FARKLI SET TİPLERİNİ KULLANINIZ.
         */

        System.out.println(yeniArray());

    }

    public static ArrayList<Integer> yeniArray(){

        Scanner intRead=new Scanner(System.in);
        HashSet<Integer> Liste=new HashSet<>();
        ArrayList<Integer> YeniArrayListe=new ArrayList<>();
        System.out.println("bir HashSet tanımlayınız");
        System.out.print("eleman sayısı=");
        int uzunluk=intRead.nextInt();
        int sayac=1;
        do {
            System.out.print(sayac+". deger= ");
            Liste.add(intRead.nextInt());
            sayac++;
        }while (sayac<=uzunluk);

        for (int i:Liste){
            YeniArrayListe.add(i);
        }

        return YeniArrayListe;
    }
}
