package Challengvs.Calisma2;

public class ElektrikHesabi {

    int toplamTuketim=0;
    double birimfiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int tuketim){

        toplamTuketim+=tuketim;

    }
    public void ToplamTuketimYaz(){
        System.out.println("toplam tüketim= "+
                toplamTuketim);
    }

    public void odenecekTutar(){
        fatura=birimfiyat*toplamTuketim;
        System.out.println("ödenecek tutar= "+fatura);
    }

}
