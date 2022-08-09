package ClassCalisma1;

import java.util.ArrayList;

public class Calisma1 {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi,ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        ogrenci ogr=new ogrenci();
        okul okl=new okul();

        ogr.tamAd="mehmet haşir dut";
        ogr.okulNo=259;
        ogr.okulu="techno study";

        okl.adi="techno study";
        okl.mudurAdi="ismet temur";
        okl.ucreti=1500D;





    }
}

class ogrenci{

    okul okl=new okul();
    int okulNo;
    String tamAd;
    String okulu;

}

class okul{
    String adi;
    String mudurAdi;
    Double ucreti;


}