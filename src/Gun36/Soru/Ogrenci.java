package Gun36.Soru;

public class Ogrenci extends Kisi {
    private double ucret;


    public Ogrenci(String isim, String adres, String okul, uyetipi tip, double ucret) {
        super(isim, adres, okul, tip);
        this.ucret=ucret;
    }

    public Ogrenci(uyetipi tip) {
        super(tip);
    }
}
