package Challengvs;

import java.util.Scanner;

public class Calisma5 {
    public static void main(String[] args) {

        //  Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayi=oku.nextInt();


        switch(sayi/100){
            case 1:
                String a111="yüz";
                System.out.print(a111);
                break;
            case 2:
                String a222= "ikiyüz";
                System.out.print(a222);
                break;
            case 3:
                String a333="üçyüz";
                System.out.print(a333);
                break;
            case 4:
                String a444="dörtyüz";
                System.out.print(a444);
                break;
            case 5:
                String a555="beşyüz";
                System.out.print(a555);
                break;
            case 6:
                String a666="altıyüz";
                System.out.print(a666);
                break;
            case 7:
                String a777="yediyüz";
                System.out.print(a777);
                break;
            case 8:
                String a888="sekizyüz";
                System.out.print(a888);
                break;
            case 9:
                String a999="dokuzyüz";
                System.out.print(a999);
                break;

        }

        switch ((sayi/10)%10){
            case 1:
                String a11="on";
                System.out.print(a11);
                break;
            case 2:
                String a22="yirmi";
                System.out.print(a22);
                break;
            case 3:
                String a33="otuz";
                System.out.print(a33);
                break;
            case 4:
                String a44="kırk";
                System.out.print(a44);
                break;
            case 5:
                String a55="elli";
                System.out.print(a55);
                break;
            case 6:
                String a66="altmış";
                System.out.print(a66);
                break;
            case 7:
                String a77="yetmiş";
                System.out.print(a77);
                break;
            case 8:
                String a88="seksen";
                System.out.print(a88);
                break;
            case 9:
                String a99="doksan";
                System.out.print(a99);
                break;

        }

        switch (sayi%10) {
            case 1:
                String a1 = "bir";
                System.out.print(a1);
                break;
            case 2:
                String a2 = "iki";
                System.out.print(a2);
                break;
            case 3:
                String a3 = "üç";
                System.out.print(a3);
                break;
            case 4:
                String a4 = "dört";
                System.out.print(a4);
                break;
            case 5:
                String a5 = "beş";
                System.out.print(a5);
                break;
            case 6:
                String a6 = "altı";
                System.out.print(a6);
                break;
            case 7:
                String a7 = "yedi";
                System.out.print(a7);
                break;
            case 8:
                String a8 = "sekiz";
                System.out.print(a8);
                break;
            case 9:
                String a9 = "dokuz;";
                System.out.print(a9);
                break;
        }


    }
}
