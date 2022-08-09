package Gun34.OdevSorulari.Soru1;

public class MainTest {
    public static void main(String[] args) {
        /*
        Burada iki adet class vardır. Biri **Main**, diğeri ise **student ,**

**student classı içinde;**

String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.

getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.

**Main classın içinde**;

Örnek:

**age 12**'dir.

**name Steven**'dır.

name(isim) olarak;

**"Student name is Steven"**

ve

age(yaş) olarak da;

"He is 12 years old"
         */

        Ogrenci ogr1=new Ogrenci();
        ogr1.age=12;
        ogr1.name="Steven";

        System.out.println("name "+ogr1.name+"'dır");
        System.out.println("He is "+ogr1.age+" years old");

    }
}
