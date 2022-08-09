package Challengvs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
       /*
        String a = "500";
        byte b = 24;
        short c = 265;
        int d = 500;
        long e= 2354859;
        float f=25.25F;
        double g = 2351.253625;

        */
/*
        int donusum= Integer.parseInt(a);            // Stringin içindeki sayıyı integer veri tipine dönüştürüyor
        System.out.println("donusum = " + donusum);  // Stringin içini parçalıyor parse parçalamak demek

        g = d;                      // tanımlı olan küçük veri tipini büyük veri tipine atamalarda sorun olmuyor.
        System.out.println(g);      // örneğin integer veri tipinden double veri tipine atamadaki gibi

        f = b;                      // tanımlı olan küçük veri tipini büyük veri tipine atamalarda sorun olmuyor demiştik.
        System.out.println(f);      // veri kaybı da olmuyor (widening casting deniyor)


        b = (byte)c;                // tanımlı olan büyük veri tipini küçük veri tipine atamalarda kayıp olabilir.
        System.out.println(b);      // bunu yapmak için küçük veri tipinde olan tip yani sol sabit kalır, sağın veri tipini de sola eşitleriz.

        d = (int)f;
        System.out.println(d);
     

        b = (byte)g;
        System.out.println(b);



        Scanner oku = new Scanner(System.in);
        System.out.print("lütfen bir şeyler yazınız: ");
        String girilen = oku.nextLine();
        
        int boy = girilen.length();             // length kelimenin veya cümlenin uzunluğunu verdiği için saymaya 1 den başlar
        System.out.println("boy = " + boy);

        char istenilen = girilen.charAt(10);    // charAt ise saymaya 0 dan başlar
        System.out.println("istenilen = " + istenilen);
        
        int girilenUzunluk= girilen.length();          // girilen bir metnin sondan birinci harfini alma
        char girileninSonKarakteri = girilen.charAt(girilenUzunluk-1);     // önce uzunluğunu sonra da uzunluktan bir çıkarıp istenilen char ı alıyoruz
        System.out.println("istenilen2 = " + girileninSonKarakteri);

        int HangiIndex = girilen.indexOf("m");
        int HangiIndex1 = girilen.indexOf("ha");
        int HangiIndex2= girilen.indexOf("Dünya");
        System.out.println("m : "+HangiIndex+"ha : "+HangiIndex1+"Dünya : "+HangiIndex2);
        


        String s1 = "Merhaba";                      // charAt verilen bir sayının kelimedeki hangi karaktere karşılık geldiğini ve o karakteri verir
        String s2="Dünya";                          // indexOf verilen bir metinde aradığımız bir harfin ya da metnin hangi indexten başladığını verir
        String s3= s1.concat(" "+s2);           // concat birleştirmek demek ve iki ayrı stringi birleştirme işlemi yapar.
        System.out.println("birleşik hali: "+s3);   // length ise girilen Stringin boyunu verir

        boolean VarMi=s3.contains("M");             // contains boolean çevirir ve Stringin içinde herhangi bir karakterin olup olmadığını kontrol eder.
        boolean VarMi1= s3.contains("x");
        System.out.println("M var mı? " + VarMi);
        System.out.println("x var mı? "+VarMi1);

        String s4 = "Merhaba";
        boolean EsitMi=s1.equals(s2);               // equals boolean veri tipi çevirir ve iki Stringin birbirine eşit olup olmadığını kontrol eder.
        boolean EsitMi1=s1.equals(s4);
        System.out.println("s1 s2 ye eşit mi? "+EsitMi);
        System.out.println("s1 s4 e eşit mi? "+EsitMi1);

        String s5="MERHABA";
        Boolean EsitMi2=s1.equalsIgnoreCase(s5);        // büyük küçük harf farketmeksizin iki stringin aynı olup olmadığını kontrol eder.
        System.out.println("s1 ile s5 büyük küçük karakter farketmeksizin birbirine eşit midir? "+EsitMi2);

        System.out.println("s1 Stringinin içi boş mu? "+ s1.isEmpty()); // isEmpty anlamından da anlaşılacağı üzere Stringin içinin boş mu olduğunu kontrol eder.

        System.out.println("ilk a nın hangi indexte olduğu = "+s1.indexOf("a"));        // indexOf bir harfin veya karakterin baştan sayarak hangi indexte olduğunu gösterir
        System.out.println("son a nın hangi indexte olduğu = "+s1.lastIndexOf("a"));   //lastIndexOf ise bir harfin veya karakterin sondan başlayarak hangi indexte olduğunu gösterir

 */

        /*
        Girilen vize ve final notlarına göre öğrencinin dersten geçip geçmediğini bulan algoritma ve akış diyagramını tasarlayınız.


        Scanner oku = new Scanner(System.in);

        System.out.print("Lütfen vizenizi giriniz: ");
         int x = oku.nextInt();
         int xOrt=x*40/100;
        System.out.print("Lütfen finalinizi giriniz: ");
        int y = oku.nextInt();
        int yOrt=y*60/100;
        if((xOrt+yOrt)>=50){
            System.out.println("Tebrikler dersten geçtiniz");
        }else{
            System.out.println("Maalesef dersten kaldınız");
        }
        */

        /*
        Verilen tamsayının sıfır, pozitif ya da negatif olup olmadığını bulan algoritma ve akış diyagramını tasarlayınız.
         */
/*
        Scanner oku = new Scanner(System.in);

        for (;;) {
            System.out.print("lütfen bir sayı giriniz: ");
            int a = oku.nextInt();

            if (a == 0) {
                System.out.println("girilen değer 0 dır");
            } else if (a > 0) {
                System.out.println("girilen değer pozitiftir");
            } else {
                System.out.println("girilen değer negatiftir");
            }
        }
*/


        
    }
}
