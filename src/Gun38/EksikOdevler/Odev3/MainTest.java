package Gun38.EksikOdevler.Odev3;

public class MainTest {
    public static void main(String[] args) {
        /*
        1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
  olacak kimlik belgesi formu oluşturan tek bir metod yazınız.

  not: 3.istekdeki gibi her iki sınıfnda çalşacağı bir metodun olabilmesi için,
    her iki sınıfın da bir üst sınıftan türetilmesi zorunludur.
    aksi halde ayrı ayı 2 metod yazılmak zorunda kalınır.


önemli not : bir classın kimden aslında  kim olduğunu bulma yöntemi      :
if (kisi instanceof Ogrenci)  // kisi aslında Ogrenci mi ?
         */

        Ogrenci ogr=new Ogrenci("mehmet","dut","öğrenmek","Techno 1");
        Calisan cls=new Calisan("ismet", "temur", "öğretmek","javaskills");
        if (ogr instanceof Ogrenci)
            System.out.println(ogr.kimlik());
        if (cls instanceof Calisan)
            System.out.println(cls.kimlik());
    }
}
