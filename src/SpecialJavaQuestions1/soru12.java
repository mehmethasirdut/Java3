package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {

        /*
        12- Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
Örnek: "abc", "cat" --> "abcat"
"abc", "dog" -->"abcdog"
         */

        Scanner oku=new Scanner(System.in);
        System.out.println("birinci stringi giriniz");
        String text1=oku.nextLine();
        System.out.println("ikinci stringi giriniz");
        String text2=oku.nextLine();
        String birlestir;
        if (text1.charAt(text1.length()-1)==text2.charAt(0))
            birlestir=text1.concat(text2.substring(1));
        else birlestir=text1.concat(text2);

        System.out.println(birlestir);

    }
}
