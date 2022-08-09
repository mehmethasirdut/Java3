package Challengvs;

import Challengvs.ClassCalisma4.MathSinifi;

import java.util.Scanner;

public class Calisma6 {
    public static void main(String[] args) {
        // kullanıcıda x girilene kadar ekrana program çalışıyor yazın ve x girildiğinde ise program bitti yazan programı yaz

        Scanner oku = new Scanner(System.in);
        String girilen="";
        do {
            System.out.print("String giriniz: ");
            girilen=oku.nextLine();
            if(!girilen.equals("x"))
            System.out.println("program çalışıyor");

            if(girilen.equals("x"))
                System.out.println(" program bitti ");

        } while(!girilen.equals("x"));






    }
}
