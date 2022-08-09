package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {

        /*
        9- Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında Random int tipinde bir sayı
üreten programı yazınız.
not : girilen sayı üretilen sayılara dahil olmalı
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz");
        int sayi=oku.nextInt();

        int uretilen=(int)(Math.random()*sayi +1);

    }
}
