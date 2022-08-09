package Gun09;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class odev060522 {
    public static void main(String[] args) {

       // 1-Verilen iki int hakkında (num1,  num2),İlk int'i ikinci int'e bölün.Sonucu yazdırın.

        int num1,num2;
        num1= 10; num2=5;
        System.out.println("num1/num2 = " + (num1/num2));

       // 2-Verilen int ler hakkında, (num1, num2),num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.int sonucu yazdırın.

        int num3,num4,sonuc;
        num3=20; num4=10;
        sonuc= num3/num4;
        System.out.println("sonuç = " + sonuc);

       // 3-Verilen 3 double hakkında, (num1 , num2, num3),Bu üç double'ı birbiriyle çarpın ve cevabı  **sonuca** eşitleyin.Sonucu yazdırın.

        double a=10.4;
        double b=2.5;
        double c=1.8;
        double sonuc1=a*b*c;
        System.out.println("üç double ın birbiriyle çarpımı = " + sonuc1);


       // 4- Oluşturulmuş olan double'lar hakkında,Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.Double sonucu yazdırın.

        double sonuc2= a*b*c*sonuc1;
        System.out.println("dört double ın çarpımı = " + sonuc2);

        // 5-Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin. **int sonuc** u yazdırın.

        int sonuc3= num1*num2*num3*num4;
        System.out.println("verilen intlerin birbiriyle çarpımı = " + sonuc3);

       // 6- Verilen int ler hakkında (num1, num2),num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin.int sonucu yazdırın.

        int sonuc4=num1%num2;
        System.out.println("num1 in num2 ye bölümünden kalan = " + sonuc4);

        // 7-Verilen int ler hakkında (num1 ve num2),num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.int sonuc'u yazdırınız.

        int sonuc5=num1%num2;
        System.out.println("num1 in num2 ye bölümünden kalan = " + sonuc5);

      // 8-Verilen iki int hakkında,num1'in num2'ye bölümünden kalanı yazdırınız.

        System.out.println("num1 in num2 ye bölümünden kalan= "+ (num1%num2));

       // 9-Verilen 2 tane int (num1, num2),Int'lerin farkını yazdırın.

        System.out.println("num1 - num2= "+(num1-num2));

       // 10-Verilen 4 tane int (num 1, num2 , num3 , num4),Int'leri birbirinden çıkarın.Sonucu yazdırın.

        System.out.println("num1 num2 num3 num4 ün birbirinden farkı= "+ (num1-num2-num3-num4));

        //Özel Sorular 1- Girilen bir sayının birler basamağını ekrana yazdırınız.

        Scanner oku1=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        int sayi=oku1.nextInt();
        System.out.println("girilen sayının birler basamağı: "+ (sayi%10));

        //Özel Sorular 2- Girilen bir sayının onlar basamağını ekrana yazdırınız.

        Scanner oku2= new Scanner(System.in);
        System.out.print("lütfen en düşük iki basamaklı bir sayı giriniz");
        int sayi1=oku2.nextInt();
        System.out.println("girilen sayının onlar basamağı: "+ ((sayi1/10)%10));

        //Özel Sorular 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.

        Scanner oku3=new Scanner(System.in);
        System.out.print("lütfen en az düşük üç bakamaklı bir sayı giriniz: ");
        int sayi2=oku3.nextInt();
        System.out.println("girilen sayının yüzler basamağı: "+ ((sayi2/100)%10));

        //Özel Sorular 4- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz

        Scanner oku4=new Scanner(System.in);
        System.out.print("lütfen vize sınav sonucunuzu giriniz: ");
        int vize = oku4.nextInt();
        System.out.println("lütfen final sınav sonucunuzu giriniz");
        int ffinal=oku4.nextInt();
        double ortalama = 0.4*vize + 0.6*ffinal;
        System.out.println("ortalamanız: "+ ortalama);

    }
}
