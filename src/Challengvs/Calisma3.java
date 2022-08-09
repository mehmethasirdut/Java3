package Challengvs;

import java.util.Scanner;

public class Calisma3 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz: ");
        String sifre = oku.nextLine();

        String gizli = "bayrak";

        Boolean a1 = true;
        Boolean b1=false;

        if(sifre.equals(gizli) == a1){
            System.out.println("bildin");
        }

        if(sifre.equals(gizli) == false){
            System.out.println("bilemedin");
        }






    }
}
