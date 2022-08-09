package Challengvs._210622.Soru1;

public class Kartal extends Hayvan{


    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Kartal etçil bir hayvandır");
    }

    @Override
    void yemekMiktari() {
        System.out.println("sadece aç kaldığında avlanır");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("kartallar fazla uyumaz, yalnız uçar");

    }

    @Override
    void sesi() {
        System.out.println("kartallar çığlık atar");

    }

}
