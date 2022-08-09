package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        /*
        2- Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=oku.nextInt();
        int deger=sayi%2;

        switch (deger){
            case 0:
                System.out.println("girelen değer çifttir");break;
            case 1:
                System.out.println("girilen değer tektir");break;
        }

        //burda if ile basit bir şekilde çözebilirdim ama konuları tekrar amacıyla switch case ile çözdüm
    }
}
