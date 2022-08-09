package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {

        // 11- Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("bir text giriniz");
        String text=oku.nextLine();
        text=text.trim();
        int sayac=0;
        for (int i =0;i<text.length(); i++){
            if (text.charAt(i)!=' ')
                sayac++;

        System.out.println(sayac);


        }
    }
}
