package Gun38.EksikOdevler.Odev1;

public class Ogrenci extends Kisi{
    private double ucret;

    public Ogrenci(String isim, String adres, UyeTipi tip,double ucret) {
        super(isim, adres,tip);
        setUcret(ucret);
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + super.toString()+
                "ucret=" + ucret +
                '}';
    }
}
