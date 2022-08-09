package Challengvs.EnumCalisma;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparis {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        ArrayList siparis=new ArrayList<>();
        System.out.println("pizza sipariş hattına hoş geldiniz");

        int oku3=0;
        do {
            System.out.println("hangi çeşit pizza alırsınız?\n1- Tavuklu Pizza\n" +
                    "2- Dana Etli Pizza\n 3- Karışık Pizza");
            int oku = read.nextInt();

            if (oku==1)
                siparis.add(pizzacesitleri.TAVUKLUPIZZA);
            if (oku==2)
                siparis.add(pizzacesitleri.DANAETLIPIZZA);
            if (oku==3)
                siparis.add(pizzacesitleri.KARISIKPIZZA);


            System.out.println("hangi boyutta olsun?\n1-Small\n2-Medium\n3-Large");
            int oku1 = read.nextInt();

           // siparis.add()


            System.out.println("başka sipariş var mı? 1-Evet 2-Hayır");
            oku3=read.nextInt();

        }while(oku3==1);




    }
}
