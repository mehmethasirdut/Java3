package Challengvs;

import java.util.Scanner;

public class Calisma10 {
    public static void main(String[] args) {

        for (int i =1;i<=3;i++)
            System.out.println(isim()+" adlı kişinin ortalaması "+puanal());


        }

    public static String isim(){
        Scanner oku=new Scanner(System.in);
        System.out.println("isminizi giriniz: ");
        return oku.nextLine();
    }

    public static int puanal() {
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i =1;i<=3;i++) {
            System.out.println(i+"puanınızı giriniz");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;
        }
        int ortalama=toplam/3;
        return ortalama;
    }


    }
