package Challengvs;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz: ");
        String sifre = oku.nextLine();

        String gizli = "bayrak";
        boolean esitMi = sifre.equals(gizli);

        if (esitMi == true) {
            System.out.println("şifre geçerli");
        }

        if (esitMi == false) {
            System.out.println("şifre geçersiz");
        }

    }
}