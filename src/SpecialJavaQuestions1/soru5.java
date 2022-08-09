package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        /*
        5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
number:6
factorial:1*2*3*4*5*6=720
output ---> 720
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz");
        int sayi=oku.nextInt();
        long carpim=1;
        for (int i=1;i<=sayi;i++){
            carpim*=i;
        }
        System.out.println("faktoriyeli: "+carpim);
    }
}
