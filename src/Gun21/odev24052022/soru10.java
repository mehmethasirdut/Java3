package Gun21.odev24052022;

import java.util.ArrayList;
import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {


//        10-
//
//
//
//**isUnique** adında bir method oluşturun.
//
//        Parametre olarak int array alır.
//
//                ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//
//        örneğin, list isminde bir array'imiz varsa,
//
//```
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//```
//
//        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//
//```
//        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//```
//
//        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        Scanner read=new Scanner(System.in);
        System.out.println("Arraylistin elemanlarını giriniz");
        System.out.println("Arraylistin kaç elemanı olsun?");
        int elemansayisi=read.nextInt();
        int sayac=0;
        ArrayList<Integer> liste=new ArrayList<>();
        do{
            sayac++;
            System.out.print(sayac+". degeri giriniz: ");
            int sayi=read.nextInt();
            liste.add(sayi);
            elemansayisi--;
        }while (elemansayisi>0);

        System.out.println(liste);
        System.out.println(isUnique(liste));

    }

    public static boolean isUnique(ArrayList<Integer> liste){
        boolean donus=true;
        for (int i=0;i<liste.size();i++){
            int sayac=0;
            do{
                if (liste.get(i)==liste.get(sayac)&&i!=sayac){
                    donus=false;
                }
                sayac++;
            }while(sayac<liste.size());
        }
        return donus;
    }
}
