package Gun38.EksikOdevler.Odev1;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private int maxOgrenciSayisi;

    ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
    ArrayList<Calisan> calisanlar=new ArrayList<>();

    public Okul(String isim, int maxOgrenciSayisi) {
        this.isim = isim;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }
}
