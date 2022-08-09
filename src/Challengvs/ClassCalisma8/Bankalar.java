package Challengvs.ClassCalisma8;

public class Bankalar {
    public static void main(String[] args) {

        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Banka bank1=new Banka("Garanti", 45,1980);
        Banka bank2=new Banka("Ziraat", 50,1960);
        Banka bank3=new Banka("Vakif", 55,1991);
        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);

    }
}
