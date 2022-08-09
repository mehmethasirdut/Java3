package Gun11_mentoring;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //haftanın gunlerını alarak o gunun tatıl mı iş gunu mu oldugunu bulunuz
        Scanner sc=new Scanner(System.in);
        System.out.print("lutfen gunu gırınız=");
        String gun=sc.nextLine();
        if (gun.equals("pazartesi")){
            System.out.println("çalışmaya devam");
        }
        if (gun.equals("salı")){
            System.out.println("çalışmaya devam");
        }
        if (gun.equals("çarşamba")){
            System.out.println("çalışmaya devam");
        }
        if (gun.equals("perşembe")){
            System.out.println("çalışmaya devam");
        }
        if (gun.equals("cuma")){
            System.out.println("çalışmaya devam");
        }
        if (gun.equals("cumartesi")){
            System.out.println("yaşasın tatil");
        }
        if (gun.equals("pazar")){
            System.out.println("yaşasın tatil");
        }

    }
}
