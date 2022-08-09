package Challengvs;

import java.util.Scanner;

public class Calisma7 {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadığnıı bulunumuz
        // 16 4*4, 9*9 gibi

        Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=oku.nextInt();
        int sayac=1;
        int carpim;
        int deger=1;
        while (sayac<=sayi) {

            deger = sayac * sayac;
            if (deger == sayi) break;
            sayac++;
        }
       if(deger==sayi) System.out.println("girilen değer sağlıyor"+sayac+"*"+sayac+"dir");
        if (deger!=sayi) System.out.println("girilen değer sağlamıyor");






    }
}
