package Challengvs;

import java.util.Locale;
import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("iki tam sayı giriniz= ");
        int sayi1=oku.nextInt();
        int sayi2=oku.nextInt();
        Scanner oku1=new Scanner(System.in);
        System.out.println("Taplama için T\n Çıkarma için Ç\n çarpma için P \n bölme için B \ntuşuna basınız");
        String harf=oku1.nextLine();

        switch (harf.trim().toUpperCase()) {
            case "T":
                System.out.println("iki sayının toplamı: " + (sayi1 + sayi2));
                break;
            case "Ç":
                System.out.println("iki sayının farkı: " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("iki sayının çarpımı: " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("iki sayının bölümü: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("tanımlı böyle bir işlem yoktur."); break;
        }





    }

}
