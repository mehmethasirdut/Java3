package Gun33.BigWorks1;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {

        /*
        3- a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye
sahiplerse true değerini döndürünüz.
Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
         */

        Scanner read=new Scanner(System.in);
        System.out.print("ilk dizinin eleman sayisi kaç olsun=");
        int dizi1length=read.nextInt();
        System.out.print("ikinci dizinin eleman sayisi kaç olsun=");
        int dizi2length=read.nextInt();
        int[] dizi1=new int[dizi1length];
        int[] dizi2=new  int[dizi2length];
        int sayac1=0;
        do{
            System.out.print("birinci dizinin "+(sayac1+1)+". elemanı=");
            dizi1[sayac1]=read.nextInt();
            sayac1++;
        }while (sayac1<dizi1length);
        int sayac2=0;
        do{
            System.out.print("ikinci dizinin "+(sayac2+1)+". elemanı=");
            dizi2[sayac2]=read.nextInt();
            sayac2++;
        }while (sayac2<dizi2length);

        if (dizi1[0]==dizi2[0]||dizi1[dizi1length-1]==dizi2[dizi2length-1])
            System.out.println(true);
        else
            System.out.println(false);

    }
}
