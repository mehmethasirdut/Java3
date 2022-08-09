package Challengvs.ClassExtends2;

public class Sirket {
    public static void main(String[] args) {

        GenelMudur mdr=new GenelMudur("ismet",4.000,0.7);

        System.out.println(mdr);
        double tazminat= mdr.tazminat(mdr.maas,mdr.maasKatSayisi);
        System.out.println("müdürün tazminat miktarı="+ tazminat);
        System.out.println("müdürün toplam maaşı= "+mdr.maashesapla(mdr.maas, tazminat));
    }
}
