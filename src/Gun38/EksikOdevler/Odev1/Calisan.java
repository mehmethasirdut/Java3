package Gun38.EksikOdevler.Odev1;

public class Calisan extends Kisi {
    private double maas;

    public Calisan(String isim, String adres, UyeTipi tip, int i) {
        super(isim, adres, tip);
        setMaas(maas);

    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calisan{" + super.toString()+
                "maas=" + maas +
                '}';
    }
}
