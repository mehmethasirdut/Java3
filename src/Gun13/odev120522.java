package Gun13;

import java.util.Scanner;

public class odev120522 {
    public static void main(String[] args) {

        // 1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız

        Scanner oku1= new Scanner(System.in);
        System.out.println("ayın numara değerini: ");
        int ay= oku1.nextInt();
        System.out.println("ayın gününü giriniz: ");
        int gün= oku1.nextInt();

        switch (ay){
            case 1:
                System.out.println("ocak ayının "+gün+". günü");break;
            case 2:
                System.out.println("şubat ayının "+gün+". günü");break;
            case 3:
                System.out.println("mart ayının "+gün+". günü");break;
            case 4:
                System.out.println("nisan ayının "+gün+". günü");break;
            case 5:
                System.out.println("mayıs ayının "+gün+". günü");break;
            case 6:
                System.out.println("haziran ayının "+gün+". günü");break;
            case 7:
                System.out.println("temmuz ayının "+gün+". günü");break;
            case 8:
                System.out.println("ağustos ayının "+gün+". günü");break;
            case 9:
                System.out.println("eylül ayının "+gün+". günü");break;
            case 10:
                System.out.println("ekim ayının "+gün+". günü");break;
            case 11:
                System.out.println("kasım ayının "+gün+". günü");break;
            case 12:
                System.out.println("aralık ayının "+gün+". günü");break;

        }

        //  2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayi=oku.nextInt();

        switch(sayi/100){
            case 1:
                String a111="yüz";System.out.print(a111);break;
            case 2:
                String a222= "ikiyüz";System.out.print(a222);break;
            case 3:
                String a333="üçyüz";System.out.print(a333);break;
            case 4:
                String a444="dörtyüz";System.out.print(a444);break;
            case 5:
                String a555="beşyüz";System.out.print(a555);break;
            case 6:
                String a666="altıyüz";System.out.print(a666);break;
            case 7:
                String a777="yediyüz";System.out.print(a777);break;
            case 8:
                String a888="sekizyüz";System.out.print(a888);break;
            case 9:
                String a999="dokuzyüz";System.out.print(a999);break;

        }

        switch ((sayi/10)%10){
            case 1:
                String a11="on";System.out.print(a11);break;
            case 2:
                String a22="yirmi";System.out.print(a22);break;
            case 3:
                String a33="otuz";System.out.print(a33);break;
            case 4:
                String a44="kırk";System.out.print(a44);break;
            case 5:
                String a55="elli";System.out.print(a55);break;
            case 6:
                String a66="altmış";System.out.print(a66);break;
            case 7:
                String a77="yetmiş";System.out.print(a77);break;
            case 8:
                String a88="seksen";System.out.print(a88);break;
            case 9:
                String a99="doksan";System.out.print(a99);break;

        }

        switch (sayi%10) {
            case 1:
                String a1 = "bir";System.out.print(a1);break;
            case 2:
                String a2 = "iki";System.out.print(a2);break;
            case 3:
                String a3 = "üç";System.out.print(a3);break;
            case 4:
                String a4 = "dört";System.out.print(a4);break;
            case 5:
                String a5 = "beş";System.out.print(a5);break;
            case 6:
                String a6 = "altı";System.out.print(a6);break;
            case 7:
                String a7 = "yedi";System.out.print(a7);break;
            case 8:
                String a8 = "sekiz";System.out.print(a8);break;
            case 9:
                String a9 = "dokuz;";System.out.print(a9);break;
        }

        // 3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

        Scanner oku2=new Scanner(System.in);
        System.out.println("max değerini giriniz: ");
        int max=oku2.nextInt();
        System.out.println("min değerini giriniz: ");
        int min=oku2.nextInt();

        int randomsayi=(int)(Math.random()*(max-min)+1) +min;
        switch (randomsayi%10){
            case 0:
                System.out.println("sıfır");break;
            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.println("iki");break;
            case 3:
                System.out.println("üç");break;
            case 4:
                System.out.println("dört");break;
            case 5:
                System.out.println("beş");break;
            case 6:
                System.out.println("altı");break;
            case 7:
                System.out.println("yedi");break;
            case 8:
                System.out.println("sekiz");break;
            default:
                System.out.println("dokuz");break;
        }

    }
}
