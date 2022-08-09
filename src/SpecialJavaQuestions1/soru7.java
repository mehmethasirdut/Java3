package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        /*
        7- Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
yazdırınız.
Not: sqrt gibi fonksiyonları kullanmayın.
Example 1:
Input: 16
Output: true
Not: bu sayı tam kare çünkü 4*4 = 16
Example 2:
Input: 14
Output: false (14 tam kare degil)
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=oku.nextInt();
        int sayac=1;
        double deger;
        while (sayac<=sayi){
            deger=sayac*sayac;
            if (deger==sayi) {
                System.out.println(true);
                break;
            }
            if (sayac==sayi&&deger!=sayi)
                System.out.println(false);
            sayac++;
        }


    }
}
