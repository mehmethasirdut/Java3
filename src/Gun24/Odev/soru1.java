package Gun24.Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        /*
        1-

ismi getCount() olan bir method oluşturun.

Parametre olarak bir String ArayList  ve  bir tane String

Return tipi int olmalı.



ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.


Örneğin;

ArrayList = Orange , Kiwi , Peach , Banana , Orange

String Orange:

Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

        Scanner read=new Scanner(System.in);
        ArrayList<String> liste =new ArrayList<>();
        Scanner read1=new Scanner(System.in);
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=read1.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". meyveyi giriniz");
            liste.add(read.nextLine());
        }
        System.out.println("hangi meyvenin ve sepette kaç tane olduğunun kontrolü için meyve ismi giriniz");
        String deger=read.nextLine();

        System.out.println(getCount(liste,deger)+" adet var");

    }

    public static int getCount(ArrayList<String> liste, String deger){

        int kargo=0;

        for (int i=0;i<liste.size();i++)
            if (liste.get(i).equals(deger))
                kargo++;

        return kargo;

    }
}
