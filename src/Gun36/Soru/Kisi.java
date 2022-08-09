package Gun36.Soru;

public class Kisi {
    private String isim;
    private String adres;
    private String okul;

    private uyetipi tip;

    public Kisi(String isim, String adres, String okul, uyetipi tip) {
        this.isim = isim;
        this.adres = adres;
        this.okul = okul;
        this.tip=tip;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public Kisi(uyetipi tip) {
        this.tip = tip;
    }

    public uyetipi getTip() {
        return tip;
    }
}
