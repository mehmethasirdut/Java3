package Gun21.odev24052022;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        /*
        4-
 adı  reverseWord olan bir method oluşturun
Bu methodun String olarak bir parametresi olmalıdır
Ve bu cümledeki kelimelerle tersine çevirmeli
Ters halini yazdırın.
Örnek 1 :
Dize: Java yazın
dönüş şöyle olmalıdır:  yazın Java
Örnek 2:
Dize: Sakin olun ve evde kalın
dönüş olmalı: kalın evde ve olun sakin
         */
        System.out.println(reverseWord());

    }
    public static String reverseWord(){

        Scanner read=new Scanner(System.in);
        System.out.println("text giriniz: ");
        String text=read.nextLine();

        String[] textdizi=text.split(" ");

        String tersi="";

        for (int i=textdizi.length-1;i>=0;i--)
            tersi= tersi + textdizi[i]+" ";

        return tersi.trim();

    }
}
