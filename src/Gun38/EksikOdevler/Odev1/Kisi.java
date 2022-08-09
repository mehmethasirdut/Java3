package Gun38.EksikOdevler.Odev1;

public class Kisi {
    private String isim;
    private String adres;
    private UyeTipi tip;

    public Kisi(String isim, String adres, UyeTipi tip) {
        setIsim(isim);
        setAdres(adres);
        setTip(tip);

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

    public Kisi(UyeTipi tip) {
        this.tip = tip;
    }

    public void setTip(UyeTipi tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", maas="+
                '}';
    }
}
