package Challengvs.ClassCalisma11;

public class sabitler {


    final int saat=24;
    final int dakika=60;
    final int saniye=60;


    public void hesapla(int a, int b, int c){

        int toplam =0;

        toplam=this.saat*a*b*c+this.dakika*c;

        System.out.println(toplam);

    }
}
