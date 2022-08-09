package Challengvs.ClassExtends2;

public class GenelMudur extends Calisan {

    public GenelMudur(String isim, double maas, double maasKatSayisi) {
        super(isim, maas, maasKatSayisi);
    }

    public double tazminat(double maas, double maasKatSayisi){
        double tazminattutari=maas*maasKatSayisi;
        return tazminattutari;
    }
}
