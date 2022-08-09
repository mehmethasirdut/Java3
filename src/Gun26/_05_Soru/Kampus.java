package Gun26._05_Soru;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Ogrenci ogr=new Ogrenci();

        ogr.okulNo=1;
        ogr.tamAd="mehmet yılmaz";

        System.out.println(ogr.tamAd);
        System.out.println(ogr.okulNo);

        Okul okul=new Okul();

        okul.adi="12 şubat";
        okul.ucreti=1500;
        okul.mudurAdi="ismet temur";

        System.out.println("öğrencinin okulunun adı= "+okul.ucreti);



    }
}
