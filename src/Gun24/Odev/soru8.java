package Gun24.Odev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        /*
        8-

secondMax()  isminde bir method oluşturun.

Parametre olarak integer ArrayList.

Return tipi int olmalı.

ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün

**ÖRN;**

ArrayList   --  5,3,4,6,7

CEVAP : 6
         */
        ArrayList<Integer> liste=new ArrayList<>();
        Scanner read=new Scanner(System.in);
        System.out.println("stringin uzunluğu kaç olsun? : ");
        int uzunluk1=read.nextInt();
        for (int i=0;i<uzunluk1;i++){
            System.out.println("birinci stringin "+(i+1)+". değeri giriniz");
            liste.add(read.nextInt());
        }
        System.out.println(secondMax(liste));

    }
    public static int secondMax(ArrayList<Integer> liste){

        int enb = liste.get(0);

        Collections.sort(liste);

        int kargo=liste.get(liste.size()-1);
        for (int i=liste.size()-2;i>=0;i--)
            if (liste.get(liste.size()-1)!=liste.get(i)){
                kargo=liste.get(i);
            break;
            }

        return kargo;
    }
}
