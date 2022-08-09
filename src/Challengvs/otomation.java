package Challengvs;

import java.util.Scanner;

public class otomation {
    public static void main(String[] args) {
        // sadece kelimelerin ilk harfini bulma programı

    Scanner oku = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String text = oku.nextLine();

        String text1 = text.replaceAll("\\B\\w", "");

        System.out.println(text1);



    }
}
