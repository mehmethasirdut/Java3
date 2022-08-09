package Gun36.Soru;

public class Calisan extends Kisi{

    private double maas;

    public Calisan(String isim, String adres, String okul, uyetipi tip, double maas) {
        super(isim, adres, okul, tip);
        this.maas=maas;
    }

    public Calisan(uyetipi tip) {
        super(tip);
    }
}
