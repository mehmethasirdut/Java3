package Gun33.BigWorks2;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        /*
        2- Girdiğiniz String parametresinin herbir karakterinin(char) sayısını döndüren charCount
metodunu yazınız.
Örnek:
String = aabbbcccc
return a , 2 olmalı
b , 3
c , 4
Not: Stringde herhangi bir char olabilir.
         */

        Scanner strRead=new Scanner(System.in);
        System.out.print("bir string giriniz=");
        String text=strRead.nextLine();
        charCount(text);

    }

    public static void charCount(String text){
        int uzunluk=text.length();

//        for (int i=0;i<uzunluk;i++){                  ikinci yöntem olabilir ;)
//            char harf=text.charAt(i);
//            int sayac=0;
//            for (int j=0;j<uzunluk;j++)
//                if (harf==text.charAt(j))
//                    sayac++;
//            System.out.println(harf+","+sayac);
//        }

        for (int i=0;i<=255;i++){           // ilk yöntem
            char deger=(char)i;
            int sayac1=0;
            for (int j=0;j<text.length();j++)
                if (text.charAt(j)==deger)
                    sayac1++;
            if (sayac1>0)
                System.out.println(deger+" , "+sayac1);

        }





    }
}
