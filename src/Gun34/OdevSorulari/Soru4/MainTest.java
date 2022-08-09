package Gun34.OdevSorulari.Soru4;

public class MainTest {
    public static void main(String[] args) {
        /*
        Burada iki adet class vardır. Biri Main diğeri ise rentApartments

rentApartments'ın içinde;

Bu variable'ları private olarak oluşturun;

String name

int roomCount

boolean balconyOrNo

Bütün variable'lar için getter ve setter oluşturunuz.

4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)

-----------------------------------------------------------------

Bir method oluşturun;

Eğer room sayısı 0 ise,

rent(kira) 1400

Eğer oda sayısı 1 ise,

rent  1700

Eğer oda sayısı 2 ise,

rent 2200

Eğer oda sayısı 3 ise,

rent 2700

rent'i return'leyin.

----------------------------------------------------------------

Bir method oluşturun.

Eğer balconyOrNo  true ise,

rent'e 200 dollar ekleyin.

Main class'ın içinde;

**userName rent is amountOfRent**
         */

        rentApartments ra1=new rentApartments("yıldız apt",2,false);
        if (ra1.getBalconyOrNo()==true)
            System.out.println("balkonlu ve "+ra1.getRoomCount()+" odalı evin kirası="+(ra1.kira()+200) );
        else
            System.out.println(ra1.getRoomCount()+" odalı evin kirası="+ra1.kira());
    }
}
