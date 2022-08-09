package Gun07;

import java.util.Locale;
import java.util.Scanner;

public class ödev040522 {
    public static void main(String[] args) {

      //  1-**paper** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın. örn: apple > APPLE

        String text1="papper";
        System.out.println("büyük harfe çevrilmiş metin: "+text1.toUpperCase());


       // 2-**OraNge** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.örn: APPLE > apple

        String text2= "OraNge";
        System.out.println("text2 nin küçük harfe çevrilmiş hali: "+ text2.toLowerCase());

      //  3-**New Jersey** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın

        String text3="New Jersey";
        System.out.println("Stringin büyük harfe çevrilmiş hali: "+ text3.toUpperCase());



       // 4-**New York** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.

        String text4= "New York";
        System.out.println("Stringin küçük harfe çevrilmiş hali: "+ text4.toLowerCase());

        // 5-**PADDLE** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.

        String text5= "PADDLE";
        System.out.println("Stringin küçük harfe çevrilmiş hali: "+ text5.toLowerCase());

        // 6-**apple** olan bir String oluşturun.String'in _içinde_ **app** olup olmadığını **doğrula**

        String text6= "apple";
        System.out.println("String içerisinde app kelimesi var mı? " + text6.contains("app"));

        // Özel sorular: 1- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String text7=oku.nextLine();
        String text8=text7.trim();
        int uzunluk1=text8.length();
        String bosluksuz=text8.replace(" ", "");
        int uzunluk2= bosluksuz.length();
        int fark = uzunluk1-uzunluk2;
        System.out.println("girilen metin "+(fark+1)+" kelimeden oluşmaktadır");

        //2- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız.


        Scanner oku1 = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String text9 = oku.nextLine();

        String text10 = text9.replaceAll("\\B\\w", "");

        System.out.println(text10);


    }
}
