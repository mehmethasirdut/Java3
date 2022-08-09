package Challengvs.ClassCalisma9;

public class Bank {
    public static void main(String[] args) {

        // Hesap (yatan, cekilen, bakiye(direk erişim olmamalı))
        // Musteri (hesapID, ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,
        // sonra 50 TL çekiniz. Müşteirini kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.

        musteri musteri1=new musteri();
        musteri1.hesapID=123;
        musteri1.ad="ismet";
        musteri1.soyad="temur";

        musteri1.MusteriHesap=new Hesap();

        musteri1.MusteriHesap.parayatir(100);
        musteri1.MusteriHesap.parayatir(200);
        musteri1.MusteriHesap.paracek(50);

        System.out.println("Extre= "+musteri1.MusteriHesap);





    }
}
