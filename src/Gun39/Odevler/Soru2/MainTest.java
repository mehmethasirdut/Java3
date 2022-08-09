package Gun39.Odevler.Soru2;

import Gun34.OdevSorulari.Soru3.Subscribe;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        /*
        2-

 6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main

Calculator'ı a super class yap.

super class'ın içinde;

calculating adında bir abstract method oluturunuz.

        Burada iki tane int parametresi vardır.

         return tipi int'dir.

Sum class'ın içinde;

        Calculator class'ına extend et.. (uzat, bağla)

        super class'ın içindeki calculating methodunu Override et.

        iki parametreyi topla ve sonucu return et.

Divide class'ının içinde,

         Calculator class'ına extend et.. (uzat, bağla)

        super class'ın içindeki calculating methodunu Override et.

         iki parametreyi böl ve sonucu return et.

Multiply class'ının içinde,

         Calculator class'ına extend et.. (uzat, bağla)

        super class'ın içindeki calculating methodunu Override et.

         iki parametreyi çarp ve sonucu return et.

Substract class'ının içinde,

         Calculator class'ına extend et.. (uzat, bağla)

        super class'ın içindeki calculating methodunu Override et.

         iki parametreyi birbirinden çıkart ve sonucu return et.

Main class'ın içinde

         scanner object oluşturunuz.

         iki int oluştur ve bu iki int değişkenine scanner ata.

Sum methodu çağır ve sonucu yazdır.

Divide methodu çağır ve sonucu yazdır.

Multiply methodu çağır ve sonucu yazdır.

Substract methodu çağır ve sonucu yazdır
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("ilk değer= ");
        int a=sc.nextInt();
        System.out.print("ikinci değer= ");
        int b=sc.nextInt();
        System.out.println();
        Sum sm=new Sum();
        System.out.println("toplamı="+sm.calculating(a,b));
        System.out.println();
        Divide dv=new Divide();
        System.out.println("bölüm="+dv.calculating(a,b));
        System.out.println();
        Multiply ml=new Multiply();
        System.out.println("çarpımı="+ml.calculating(a,b));
        System.out.println();
        Substract sb=new Substract();
        System.out.println("farkı="+sb.calculating(a,b));

    }
}
