package Challengvs;

import java.util.Scanner;

public class HesapMakinasi {

    public static void toplama(){

        Scanner oku=new Scanner(System.in);
        System.out.println("toplamını istediğiniz ilk değeri giriniz: ");
        int sayi1=oku.nextInt();
        System.out.println("toplamını istediğiniz ilk değeri giriniz: ");
        int sayi2=oku.nextInt();
        System.out.println("girilen değerlerin toplamı: "+(sayi1+sayi2));
    }
    public static void cikartma(){
        Scanner oku=new Scanner(System.in);
        System.out.println("çıkartmak istediğiniz ilk büyük sayiyi giriniz: ");
        int sayi1=oku.nextInt();
        System.out.println("çıkartmak istediğiniz ikinci küçük sayiyi giriniz: ");
        int sayi2=oku.nextInt();
        System.out.println("girilen değerlerin farkı: "+(sayi1-sayi2));
    }
    public static void bolme(){
        Scanner oku=new Scanner(System.in);
        System.out.println("bölmek istediğiniz sayilardan buyuk olani giriniz: ");
        int sayi1=oku.nextInt();
        System.out.println("bölmek istediğiniz sayilardan kucuk olani giriniz: ");
        int sayi2=oku.nextInt();
        System.out.println("girilen değerlerin bölümü: "+(sayi1/sayi2));
    }
    public static void carpma(){
        Scanner oku=new Scanner(System.in);
        System.out.println("çarpmak istediğiniz sayilardan ilkini giriniz: ");
        int sayi1=oku.nextInt();
        System.out.println("çarpmak istediğiniz sayilardan ikincisini giriniz: ");
        int sayi2=oku.nextInt();
        System.out.println("girilen değerlerin çarpımı: "+(sayi1*sayi2));
    }
    public static void faktoriyel(){
        Scanner oku=new Scanner(System.in);
        System.out.println("faktoriyelini almak istediğiniz sayiyi giriniz: ");
        int sayi=oku.nextInt();
        int fakt=1;
        for (int i=1;i<=sayi;i++)
            fakt*=i;

        System.out.println("girilen değerin faktoriyeli: "+fakt);
    }


    public static void main(String[] args) {

        System.out.println("***************HESAP MAKİNASINA HOŞGELDİNİZ******************");

        Scanner oku1=new Scanner(System.in);
        String a;
        do {
            System.out.println("toplama için 1\n" +
                                    "çıkarma için 2\n" +
                                        "çarpma için 3\n" +
                                             "bölme için 4\n" +
                                                "faktoriyel için 5\n" +
                                                    "çıkıç için q ya basınız");
            a = oku1.nextLine();
            a = a.toLowerCase();

            switch (a) {
                case "1":
                    toplama();
                    break;
                case "2":
                    cikartma();
                    break;
                case "3":
                    carpma();
                    break;
                case "4":
                    bolme();
                    break;
                case "5":
                    faktoriyel();
                    break;
                case "q":
                    System.out.println("programdan çıkılıyor... ");
                    break;
                default:
                    System.out.println("geçersiz işlem girdiniz");
                    break;
            }

        }while (!a.equals("q"));



    }
}
