package Challengvs.ClassCalisma4;

public class MathSinifi {

    public static int gettopla(int sayi1, int sayi2){

        return (sayi1+sayi2);
    }

    public static int getcikarma(int sayi1, int sayi2){
        return (sayi1-sayi2);
    }

    public static int getcarpma(int sayi1, int sayi2){
        return (sayi1*sayi2);
    }

    public static int getbolme(int sayi1, int sayi2){
        return (sayi1/sayi2);
    }

    public static int getmaks(int sayi1, int sayi2){
        int enb=sayi1;
        if (sayi2>enb)
            enb=sayi2;

        return enb;
    }

    public static int getdizitoplam(int[] dizi){
       int toplam=0;
        for (int i=0;i<dizi.length;i++){
            toplam+=dizi[i];
        }

        return toplam;
    }
}
