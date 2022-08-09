package Challengvs.ClassCalisma4;

import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {

        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int sayi1=12;
        int sayi2=3;

        System.out.println("topla "+MathSinifi.gettopla(sayi1,sayi2));
        System.out.println("cikart "+MathSinifi.getcikarma(sayi1,sayi2));
        System.out.println("carp "+MathSinifi.getcarpma(sayi1,sayi2));
        System.out.println("böl "+MathSinifi.getbolme(sayi1,sayi2));
        System.out.println("iki değerden büyüğü "+MathSinifi.getmaks(sayi1,sayi2));

        Scanner read = new Scanner(System.in);
        System.out.println("dizinin değerlerini giriniz= ");
        int[] dizi=new int[5];
        for (int i=0;i< dizi.length;i++){
        dizi[i]=read.nextInt();
        }

        System.out.println("girilen dizinin toplamı "+MathSinifi.getdizitoplam(dizi));


    }
}
