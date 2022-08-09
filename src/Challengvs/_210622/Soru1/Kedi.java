package Challengvs._210622.Soru1;

public class Kedi extends Hayvan{

    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("kedi hem ot hem et yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println("kedi çok yemek yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("kedi çok uyur");

    }

    @Override
    void sesi() {
        System.out.println("kedi miyavlar");

    }
}
