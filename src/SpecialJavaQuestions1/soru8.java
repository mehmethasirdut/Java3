package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        /*
        8- Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
Example 1:
int input = 10;
print 0 2 4 6 8 10 olmalı
Example 2:
int input = 15;
print 0 2 4 6 8 10 12 14 olmalı
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=oku.nextInt();

        for (int i=0;i<=sayi;i++){
            if (i%2==0)
                System.out.print(i+" ");

        }
    }
}
