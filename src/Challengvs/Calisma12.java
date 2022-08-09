package Challengvs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calisma12 {
    public static void main(String[] args) {

        // "aaabbccccdeeeff" şeklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f" şeklinde yazdıran metodu yapınız parametre String

        Scanner read=new Scanner(System.in);
        System.out.println("hangi karakterden kaç tane olduğunu öğrenmek için texti giriniz: ");
        String text=read.nextLine();

        ogren(text);

    }
    public static void ogren(String text){

        ArrayList<String> girilen=new ArrayList<>();
        girilen.add(text);

        for (int i=0; i<=255;i++){

            int sayac=0;
            char karakter=(char)i;
            String karaktertoString=Character.toString(karakter);

            for (int j=0;j<girilen.get(0).length();j++){
                if (karakter == (girilen.get(0).charAt(j)) )
                    sayac++;

            }
            if (sayac>0)
                System.out.print(sayac+karaktertoString);

        }

    }
}
