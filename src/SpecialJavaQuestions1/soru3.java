package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        // 3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String text=oku.nextLine();
        int sayac=0;
        for (int i=0;i<text.length();i++){
            if(text.toLowerCase().charAt(i)=='b')
                sayac++;
        }
        System.out.println("girilen string içerisinde "+sayac+" tane b harfi vardır");

        // 2. yöntem olarak

        int uzunluk=text.length();
        String text1=text.replaceAll("[Bb]","");
        int uzunluk1=text1.length();
        int kalan=uzunluk-uzunluk1;
        if (kalan==0)
            System.out.println("girilen string içerisinde hiç b harfi yoktur");
        else System.out.println("girilen string içerisinde "+kalan+" tane b harfi vardır");

    }
}
