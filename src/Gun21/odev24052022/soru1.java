package Gun21.odev24052022;

import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {
        //        1-
//
//Ismi **randomNum** olan bir method oluşturun.
//
//Parametre olarak **int max** almalı.
//
//Bu method, 0 ile max arasında random bir değer döndürmelidir.
//
//Random numarayı döndürünüz.

        Scanner sc=new Scanner(System.in);
        System.out.print("üst aralığı giriniz=");
        System.out.println(randomNum(sc.nextInt()));

    }

    public static int randomNum(int max){
        int randomdeger=(int)((Math.random()*max));
        return randomdeger;
    }
}
