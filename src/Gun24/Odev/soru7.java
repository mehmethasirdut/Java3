package Gun24.Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*
        7-

common_values() isminde bir method oluşturun.

Parametre olarak 2 tane Integer ArrayList

Return tipi integer ArrayList olmalı

 İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün

**Örneğin;**

ArrayList 1:    3 , 2 , 5 , 6

ArrayList 2:     5 , 8 , 9

return  5 olmalı

**Örneğin;**

ArrayList 1: 8,7,9,6,7

ArrayList 2: 6,7,12,3,1

return 6 ve 7 olmalı
         */

        ArrayList<Integer> liste1=new ArrayList<>();
        ArrayList<Integer> liste2=new ArrayList<>();
        Scanner read=new Scanner(System.in);
        System.out.println("ilk arrayin uzunluğu kaç olsun? : ");
        int uzunluk1=read.nextInt();
        System.out.println("ikinci arrayin uzunluğu kaç olsun? : ");
        int uzunluk2=read.nextInt();

        for (int i=0;i<uzunluk1;i++){
            System.out.println("birinci arrayin "+(i+1)+". değeri giriniz");
            liste1.add(read.nextInt());
        }
        for (int i=0;i<uzunluk2;i++){
            System.out.println("ikinci arrayin "+(i+1)+". değeri giriniz");
            liste2.add(read.nextInt());
        }
        System.out.println(liste1);
        System.out.println(liste2);

        System.out.println("kesişim listesi: "+common_values(liste1,liste2));

    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> liste1, ArrayList<Integer> liste2){
        ArrayList<Integer> liste3=new ArrayList<>();

        for (int i=0;i<liste1.size();i++){

            for (int k=0;k<liste2.size();k++)
                if (liste1.get(i)==liste2.get(k))
                    liste3.add(liste1.get(i));
        }

        return liste3;
    }
}
