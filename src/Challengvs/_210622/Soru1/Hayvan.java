package Challengvs._210622.Soru1;

public abstract class Hayvan {
    private final int id; // final ya constructor da atanır ya da ilk başta yani burda
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();
    private static int sayac=0;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = ++sayac;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println();
        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
