package Challengvs.ClassCalisma13;

public class AracPark {
    public static void main(String[] args) {
        // 1- Arac isimli bir superclass olusturunuz, fields : renk, motor, model olsun.
        // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
        // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuSayisi field ını ekleyiniz.
        // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
        //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.

        Otobus Mercedes=new Otobus("white", "32V","Mercedes",46);

        System.out.println(Mercedes);

    }
}
