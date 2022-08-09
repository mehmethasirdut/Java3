package Gun14;

import java.util.Scanner;

public class Odev130522 {
    public static void main(String[] args) {

       // 1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");

        int sayi=sc.nextInt();
        long carpim=1;
        do{
            carpim= carpim*sayi;
            sayi--;

        }while(sayi>1);
        System.out.println("girilen değere kadar sayıların çarpımı: "+carpim);


       // 2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz

        int sayac=100;
        int toplamcift=0;
        int toplamtek=0;
        do{
            if (sayac%2==1)
                toplamtek+=sayac;
            if (sayac%2==0)
                toplamcift+=sayac;

            sayac--;
        }while (sayac>0);
        System.out.println("0-100 arasındaki sayıların çift olanların toplamı: "+toplamcift);
        System.out.println("0-100 arasındaki sayıların tek olanların toplamı: "+toplamtek);




      //  3-   100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.

        int sayac1=0;
        do{
            if(sayac1%2==1)
                System.out.println(sayac1);
            sayac1++;
        }while(sayac1<=100);

       // 4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.

        int sayac2=0;
        do{
            if(sayac2%4==0&&sayac2%5==0)
                System.out.println(sayac2);
            sayac2++;
        }while (sayac2<=100);

       // 5- Sayı bulmaca oyununu tam hali ile cözünüz.

        Scanner sc1=new Scanner(System.in);
        System.out.println("****************TAHMİN PROGRAMINA HOŞGELDİNİZ*******************");
        System.out.println("hangi değerler arasında sayı tutmamı istersin");
        System.out.println("minimum değeri gir: ");
        int mindeger=sc1.nextInt();
        System.out.println("max değeri gir: ");
        int maxdeger=sc1.nextInt();

        int randomsayi=(int)(Math.random()*(maxdeger-mindeger)+1)+mindeger;

        int sayac3=1;
        int tahmin;
        do{
            System.out.println(sayac3+". tahmininiz nedir? = ");
            tahmin=sc1.nextInt();

            if (tahmin==randomsayi)
                System.out.println(sayac3+". hakkınızda bildiniz tuttuğum sayı "+randomsayi+" idi");
            sayac3++;
        }while(randomsayi!=tahmin);

    }
}
