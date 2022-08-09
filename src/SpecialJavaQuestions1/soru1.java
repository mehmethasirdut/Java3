package SpecialJavaQuestions1;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        /*
1- Kullanıcıdan yaş bilgisini isteyiniz
Eğer yaş 10 dan küçük veya eşit ise
"facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
Eğer yaş 16 dan küçük veya eşit ise
"ehliyet almak icin cok gencsin" şeklinde yazdırın
Eğer yaş 18 den küçük veya eşit ise
"dovme yaptirmak icin cok gencsin" şeklinde yazdırın
Eğer yaş 21 den küçük veya eşit ise
"alkol icmek icin cok gencsin" şeklinde yazdırın
Eğer yaş 21 den büyük ise
"istediğini yapabilirsin" şeklinde yazdırın

         */

        Scanner oku=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz: ");
        int yas=oku.nextInt();
        if (yas<=10)
            System.out.println("facebook hesabı açmak için çok gençsin");
        else if (yas<=16)
            System.out.println("ehliyet almak için çok gençsin");
        else if (yas<=18)
            System.out.println("dövme yaptırmak için çok gençsin");
        else if (yas<=21)
            System.out.println("alkol içmek için çok gençsin");
        else System.out.println("istediğini yapabilirsin");

    }
}
