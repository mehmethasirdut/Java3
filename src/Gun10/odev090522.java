package Gun10;

import java.util.Scanner;

public class odev090522 {
    public static void main(String[] args) {

        // 1- Girilen 1 sayının onlar basamağının tek olup olmadığını yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi=oku.nextInt();

        int onlar=(sayi/10)%10;

        if (onlar%2 == 1){
            System.out.println("girilen sayının onlar basamağı tektir");
        }
        if (onlar%2 == 0){
            System.out.println("girilen sayının onlar basamağı çifttir");
        }

        //2- Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.

        Scanner oku1=new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        String sifre = oku1.nextLine();
        String gizli="bayrak";

        boolean esitmi=sifre.equals(gizli);

        if(esitmi == true){
            System.out.println("girdiğiniz şifre doğru");
        }
        if(esitmi==false){
            System.out.println("girdiğiniz şifre öncekiyle eşleşmemektedir");
        }


        //3- Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.

        Scanner oku2= new Scanner(System.in);
        System.out.print("lütfen bir kelime giriniz: ");
        String kelime = oku2.nextLine();
        char ilkkarakter=kelime.charAt(0);
        char sonkarakter=kelime.charAt(kelime.length()-1);

        if(ilkkarakter == sonkarakter){
            System.out.println("girilen kelimenin ilk ve son harfi eşittir");
        }
        if (ilkkarakter != sonkarakter){
            System.out.println("girilen kelimenin ilk ve son harfi eşit değildir");
        }

        //4- Girilen bir kelimede A harfinin olup olmadığını yazdırınız.

        Scanner oku3=new Scanner(System.in);
        System.out.print("bir kelime veya text giriniz: ");
        String kelime1=oku3.nextLine();
        boolean varmi=kelime1.contains("A");
        if(varmi==true){
            System.out.println("girilen kelimede veya text te A harfi bulunmaktadır");
        }
        if(varmi == false // veya varmi "= true
        ){
            System.out.println("girilen kelimede veya text te A harfi bulunmamaktadır");}

        //5- Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.

        Scanner oku4=new Scanner(System.in);
        System.out.print("lütfen ilk kelimeyi giriniz: ");
        String kelime2=oku4.nextLine();
        System.out.print("lütfen ikinci kelimeyi giriniz: ");
        String kelime3=oku4.nextLine();
        int deger=kelime3.length()-kelime2.length();
        if(deger==0){
            System.out.println("girilen kelimelerin uzunlukları birbirine eşittir.");
        }
        if (deger!=0){
            System.out.println("girilen kelimelerin uzunlukları birbirine eşit değildir.");
        }

        //6- Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.

        Scanner oku5=new Scanner(System.in);

        System.out.print("lütfen yeni şifrenizi giriniz \" yeni şifrenin uzunluğu 8 karakterden küçük olamaz!\": ");
        String yeniSifre = oku5.nextLine();

        if(yeniSifre.length()>=8){
            String eskisifre=yeniSifre;
            System.out.println("yeni şifreniz belirlendi."+" Yeni şifre: "+eskisifre);
        }
        if (yeniSifre.length()<8){
            System.out.println("yeni şifre 8 karakterden az olamaz, lütfen daha sonra tekrar deneyiniz");
        }

    }
}
