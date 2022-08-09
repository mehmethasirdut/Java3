package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {


        // 10- Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("tutmamı istediğiniz değerin üst sınırını giriniz");
        int max=oku.nextInt();
        System.out.println("tutmamı istediğiniz değerin alt sınırını giriniz");
        int min=oku.nextInt();
        int randomsayi=(int)(Math.random()*(max-min)+1)+min;

    }
}
