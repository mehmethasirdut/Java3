package Gun38.EksikOdevler.Odev3;

public class Calisan extends Kisi{
    private String departman;
    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String kimlik() {
        return super.kimlik()+"departmanı= "+departman;
    }
}
