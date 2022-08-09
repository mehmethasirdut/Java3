package Gun21.odev24052022;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        /*
        3-

reverseString isminde bir method oluşturun.

Bu method bir String'i parametre olarak alsın.

Ve bu method, girilen String'i tersten yazsın.

Terste yazılmış halini yazdırınız.

Örn: String = "Java'yı Seviyorum."

Print: .muroyiveS ıy'avaJ
         */

        System.out.println(reverseString());

    }
    public static String reverseString(){
        Scanner read=new Scanner(System.in);
        System.out.println("tersini almak istediğiniz texti giriniz: ");
        String girilen=read.nextLine();

        String sonuc="";
        for (int i=girilen.length()-1;i>=0;i--){
            sonuc+=girilen.charAt(i);
        }
        return sonuc;
    }
}
