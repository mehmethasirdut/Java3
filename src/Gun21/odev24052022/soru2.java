package Gun21.odev24052022;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        /*
        2-

"OrtaKelime" isminden bir method oluşturun.

Bu method String'i parametre olarak almalı.

Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.

Ortadaki kelimeyi return yapınız.

Örnek: Ben Java'yı seviyorum.

print : Java'yı

Örnek2:

Java'yı kolayca öğreniyorum.

print: kolayca
         */


        System.out.println(OrtaKelime());


    }

    public static String OrtaKelime(){
        Scanner read = new Scanner(System.in);
        System.out.println("cümleyi giriniz: ");
        String text=read.nextLine();

        String[] textdizi=text.split(" ");

        String ortadakiString=textdizi[0];

        // havalar bu gün çok güzel mi
        if (textdizi.length%2==0){

            String ilk=textdizi[textdizi.length/2-1];
            String iki=textdizi[textdizi.length/2];

            String ortadakiKelimelerString=ilk+" "+iki;

            return ortadakiKelimelerString;

        }
        else {

            ortadakiString=textdizi[textdizi.length/2];

            // bugün hava güzel mi güzel
        }
        return ortadakiString;
    }


}
