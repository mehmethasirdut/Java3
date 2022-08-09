package Challengvs.ClassCalisma11;

import java.util.Scanner;

public class school {
    public static void main(String[] args) {

        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        Scanner read=new Scanner(System.in);
        sabitler zaman=new sabitler();

        System.out.println("gün sayisini giriniz");
        int gun=read.nextInt();

        System.out.println("saati giriniz");
        int time=read.nextInt();

        System.out.println("dakika giriniz");
        int minute=read.nextInt();

        zaman.hesapla(gun,time,minute);


    }
}
