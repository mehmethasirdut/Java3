package Gun11_mentoring;

import java.util.Scanner;

public class If_negatıve {
    public static void main(String[] args) {
        //haftanın gunlerını alarak o gunun tatıl olup olmadıgını bulun
        Scanner sc=new Scanner(System.in);
        System.out.print("lutfen gun gırın=");
        String gun=sc.nextLine();
        boolean sart=gun.equalsIgnoreCase("pazar");
        boolean sart2=gun.equalsIgnoreCase("cumartesi");
        if (sart){
            System.out.println("yaşasın tatil");
        }
        if (sart2){
            System.out.println("yaşasın tatil");
        }
        if (!sart)
            if (!sart2){
                System.out.println("çalışmaya devam");
            }







    }
}
