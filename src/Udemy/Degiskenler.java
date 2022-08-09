package Udemy;

public class Degiskenler {
    public static void main(String[] args) {

        // Değişkenler verilerin depolandığı yerlerdir
        // bir değişken oluşturulduğu zaman bellekte belli bir yer ayrılır
        int a=4;
        System.out.println(a);

        int b;
        b=4;
        System.out.println(b);

        a=10;
        System.out.println(a);

        int c=5;

        int d=c+12;

        System.out.println(d);

        int toplam=a+b+c+d;
        System.out.println("Toplam = "+toplam);

        // ilkel veri tipleri byte short int long, tam sayı veri tipleridir
        // int veri tipi bellekte 32 bitlik yani 4 byte lık yer kaplıyor 
        // 

        System.out.println("Byte.MAX_VALUE= "+Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE= "+Byte.MIN_VALUE);
        System.out.println("Short.MAX_VALUE= "+Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE= "+Short.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE= "+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE= "+Integer.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);

        // byte-->short-->int-->long

        short e=1000;
        int f=e/2;
        System.out.println("f= "+f);

        byte g=100;
        byte h=(byte)(g/2);

        // Double veri tipi bellekte 64 bitlik yani 8 byte lık yer kaplar
        // Float veri tipi bellekte 32 bitlik yani 4 byte lık yer kaplar
        // ondalıklı sayılar için kullanılır
        // int-->float-->double
        double i=5.25;
        double j=4.0;
        float k=(float)4.5;//buraya dikkat
        float l=5.25f; // 22/7 pi sayısı

        // char veri tipi 16 bit lik yani 2 byte lık yer kaplar bellekte
        // boolean veri tipi true veya false değerleri alır

        char aa='A';
        char bb='?';
        char cc=1000;
        System.out.println(cc);

        // unicode table dan unicode numarası alınarak aşağıdaki
        // gibi karakterler tespit edilebilir

        char dd='\u0152';
        System.out.println(dd);

        boolean ee=true;
        boolean ff=false;
        System.out.println(ee);

        // Stringler ilkel olmayan bir veri tipidir.

        String gg="java\tprogramlama\tdili";
        System.out.println(gg);

    }
}
