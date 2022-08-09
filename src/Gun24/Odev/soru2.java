package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {


        /*
        2-

getSum() isminde bir method oluşturun.

Parametresi ArrayList olmalı

Return tipi int olmalı.

ArrayList teki tüm sayıları birbiri ile toplayın.

return olarak toplam sonucu döndürün.

Örneğin;

Arraylist = 1,2,3,4,5

return 15 olmalı
         */

        Scanner read=new Scanner(System.in);
        ArrayList<Integer> liste =new ArrayList<>();
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=read.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". değeri giriniz");
            liste.add(read.nextInt());
        }

        System.out.println(getSum(liste));

    }
    public static int getSum(ArrayList<Integer> liste){

        int kargo=0;

        for (int i=0;i<liste.size();i++)
            kargo+=liste.get(i);

        return kargo;

    }
}
