package Challengvs.classCalisma5;

import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {

        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

        Scanner read =new Scanner(System.in);

        Lesson Algoritma =new Lesson();
        Algoritma.name="Algoritma";
        Algoritma.credit=3;

        Lesson Integral=new Lesson();
        Integral.name="Integral";
        Integral.credit=6;

        Lesson Geometri=new Lesson();
        Geometri.name="Geometri";
        Geometri.credit=10;

        Student ogr1=new Student();
        ogr1.name="Mehmet";
        ogr1.maxCredit=10;

        ogr1.dersEkle(Algoritma);
        ogr1.dersEkle(Integral);
        ogr1.dersEkle(Geometri);

    }
}
