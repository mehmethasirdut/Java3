package Challengvs.Encapsulation;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<7&&yas>15)
            System.out.println("öğrencinin yaşı tutmuyor");
        else
            this.yas = yas;
    }

    public Ogrenci() {
    }
}
