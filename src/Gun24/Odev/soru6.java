package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        6-

hillNum() isminde bir method oluşturun.

Parametre olarak Integer ArrayList

Return tipi int,

Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.

Örneğin;

ArrayList  5,4,6,2,1

2, 6'dan küçük ve 1 den büyüktür.

Return 2 olmalı.
         */

        ArrayList<Integer> liste =new ArrayList<>();
        Scanner IntRead=new Scanner(System.in);
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=IntRead.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". değeri giriniz");
            liste.add(IntRead.nextInt());
        }

        System.out.println(liste);
        System.out.println(hillNum(liste));
    }
    public static int hillNum(ArrayList<Integer> liste){

        int kargo=0;
        for (int i=1;i<liste.size()-1;i++)
            if (liste.get(i)<liste.get(i-1)&&liste.get(i)>liste.get(i+1))
                kargo=liste.get(i);

        return kargo;



    }
}
