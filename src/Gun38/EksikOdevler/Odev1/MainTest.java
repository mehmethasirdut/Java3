package Gun38.EksikOdevler.Odev1;

import Challengvs.ClassCalisma12.ogrenci;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        /*
        Bir okulun çalışanı ve öğrencilerinin kayıt altına alındığı bir program yapılmak isteniyor.
1- Calisan ların isim, adres, Okul, maas ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
2- Öğrenci lerin isim, adres, Okul, ücret ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
3- Okul un ise ismi, maxOgrenciSayisi, Öğrencileri ve Calisanlari vardır.
4- Main kısmında 2 öğrenci 2 çalışan oluşturup, bunları okula ekleyiniz. ve sonra listeletiniz.
         */
        Ogrenci ogr1=new Ogrenci("ismet","UK",UyeTipi.Ogrenci,1500);
        Calisan cls1=new Calisan("Mehmet","Turkey",UyeTipi.Calisan,4000);
        Okul okl=new Okul("Techno Study",200);

        okl.ogrenciler.add(ogr1);
        okl.calisanlar.add(cls1);
        System.out.println(ogr1.toString());
        System.out.println(cls1.toString());



    }
}
