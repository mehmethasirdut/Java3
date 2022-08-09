package Challengvs;

import java.util.Scanner;

public class tekrar2 {
    public static void main(String[] args) {

        // 6-Girilen bir cümledeki son kelimeyi bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("lütfen bir text giriniz: ");
        String text=oku.nextLine();

        System.out.println("textin son kelimesi: "+text.substring(text.lastIndexOf(" "), text.length()));
    }
}
