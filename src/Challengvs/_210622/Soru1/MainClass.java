package Challengvs._210622.Soru1;

public class MainClass {
    public static void main(String[] args) {
        /*
        1- id ,isim, vahsi(boolean),
   dogumTarihi (String) fieldları olan ve

   yiyecegi, yemekMiktari, gunlukUykuSuresi ve sesi isimlerinde abstract metodları,
   toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
   bir abstract class yazınız.

2- Kedi, kartal şeklinde 2 tane extend alacak normal class yazınız.

3- Main de 1 er nesne oluşturup, değerlerini atayıp, yazdırınız.

4- Benzersiz ID leri olmalı, buna göre güvenli dizayn yapınız.
         */

        Kartal kartal1=new Kartal( "Kartal", true,"15");
        Kedi kedi1=new Kedi("Kedi", false, "10");

        System.out.println(kartal1.toString());

        System.out.println(kedi1.toString());
    }

}
