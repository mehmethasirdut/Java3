package Gun21.odev24052022;

import java.util.ArrayList;
import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

//        5-
//
//                getSum isminde bir method oluşturun.
//
//        Parametresi ArrayList'tir.
//
//        Dizideki tüm $ ları kaldır ve tüm sayıları topla
//
//        return yaptğımız veri tipi 'int' olmalıdır.
//
//                sonuç 0'dan küçükse, -1 yazdırın.
//
//        Örnek1:
//
//        ArrayList = $13, $15, $20
//
//        Cevap = 48 olmalı
//
//        Örnek 2 :
//
//        ArrayList= $-13, $0, $0
//
//        Cevap = -1 olmalı.


        ArrayList<String> liste=new ArrayList<>();
        Scanner read=new Scanner(System.in);
        Scanner read1=new Scanner(System.in);
        System.out.println("kaç adet değer girmek istiyorsunuz: ");
        int sayac=read1.nextInt();

        do {
            System.out.println("deger: ");
            String girilen = read.nextLine();
            liste.add(girilen);
            sayac--;
        }while(sayac>0);

        System.out.println("toplam= "+ getSum(liste));

    }
    public static int getSum(ArrayList<String> verilen){

        int toplam=0;
        for (int i=0;i<verilen.size();i++){
            String a=verilen.get(i).replace("$","");
            int b=Integer.parseInt(a);
            toplam+=b;

        }
        if(toplam>0)
            return toplam;
        else
            return -1;

    }

}
