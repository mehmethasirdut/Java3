package Challengvs.ClassExtends2;

public class Calisan {

    /*
    Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi)
consructor ve maashesapla Metodu ekleyiniz. toString metodu ekleyiniz.
GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
     */

    String isim;
    double maas;
    double maasKatSayisi;

    public Calisan(String isim, double maas, double maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
    }
    public double maashesapla(double maas, double tazminat){
        return maas+tazminat;

    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }
}
