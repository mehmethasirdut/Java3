package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

    Scanner oku=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi=oku.nextInt();

        int onlar=(sayi/10)%10;

        switch (onlar) {
            case 0:
                System.out.println("girilen sayının onlar basamağı: " + 0);
                break;
            case 1:
                System.out.println("girilen sayının onlar basamağı: " + 1);
                break;
            case 2:
                System.out.println("girilen sayının onlar basamağı: " + 2);
                break;
            case 3:
                System.out.println("girilen sayının onlar basamağı: " + 3);
                break;
            case 4:
                System.out.println("girilen sayının onlar basamağı: " + 4);
                break;
            case 5:
                System.out.println("girilen sayının onlar basamağı: " + 5);
                break;
            case 6:
                System.out.println("girilen sayının onlar basamağı: " + 6);
                break;
            case 7:
                System.out.println("girilen sayının onlar basamağı: " + 7);
                break;
            case 8:
                System.out.println("girilen sayının onlar basamağı: " + 8);
                break;
            case 9:
                System.out.println("girilen sayının onlar basamağı: " + 9);
                break;
        }


    }
}
