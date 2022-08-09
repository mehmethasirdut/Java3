package Gun10_Mentorıng;

import java.util.Scanner;

public class _05_polindrome {
    public static void main(String[] args) {
        //bir string ifadenin  palindrome tersten okununcada aynı olup olmadıgını kontrol eden bılgısayar programını java dılınde yazınız
        Scanner oku=new Scanner(System.in);
        System.out.println("bır strıng gırın=");
        String girilen=oku.nextLine();
        //cözum ıkı yol var 1 dongu kullanmak 2 strıng builder kullanmak
        String duz="furkan";
        String ters=new StringBuffer(duz).reverse().toString();
        System.out.println("ters = " + ters);

        boolean sonuc=ters.equalsIgnoreCase(girilen);
        System.out.println("sonuc = " + sonuc);
    }
}
