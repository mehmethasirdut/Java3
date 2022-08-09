package Gun36.Soru;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OkulMain {
    public static void main(String[] args) {
        /*
        Bir okulun çalışanı ve öğrencilerinin kayıt altına alındığı bir program yapılmak isteniyor.
    1- Calisan ların isim, adres, Okul, maas ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
    2- Öğrenci lerin isim, adres, Okul, ücret ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
    3- Okul un ise ismi, maxOgrenciSayisi, Öğrencileri ve Calisanlari vardır.
    4- Main kısmında 2 öğrenci 2 çalışan oluşturup, bunları okula ekleyiniz. ve sonra listeletiniz.
         */

        Ogrenci ogr1=new Ogrenci("mehmet", "Turkey","techno", uyetipi.Ogrenci,150);
        Ogrenci ogr2=new Ogrenci("ismet","uk", "techno", uyetipi.Ogrenci,200);

        Calisan cls1=new Calisan("erol","Turkey", "techno",uyetipi.Calisan,3000);
        Calisan cls2=new Calisan("bilal", "Turkey", "techno", uyetipi.Calisan,3500);


    }

}
