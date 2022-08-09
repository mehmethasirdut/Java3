package Challengvs.Encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
        //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
        //  3- Bütün fieldlar için encapsulation uygulayınız.
        //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
        //     ArrayList cinsinden Öğrencileri olsun.
        //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
        //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuint=new Scanner(System.in);
        Okul okul=new Okul();
        Ogrenci ogr1=new Ogrenci();
        do{
            System.out.print("ad=");
            ogr1.setAd(oku.nextLine());
            System.out.print("soyad=");
            ogr1.setSoyad(oku.nextLine());
            System.out.print("yaş=");
            ogr1.setYas(okuint.nextInt());

            if(okul.ogrenciler.size()<=5)
                okul.ogrenciler.add(ogr1);
            else
                System.out.println("kontenjan doldu");


        }while(okul.ogrenciler.size()<=10);

    }
}
