package SpecialJavaQuestions1;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        6- İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
okutunuz
okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
Ornek:
String num1 = "$15";
String num2 = "$20";
String num3 = "$30";
output ----> 65; olmali
String num1 = "$15";
String num2 = "$-80";
String num3 = "$30";
output ----> -1; olmali
         */

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        do{
            System.out.println(sayac+". paranın değerini ve sembolünü giriniz. örneğin $10 gibi");
            String deger=oku.nextLine();
            deger=deger.trim();
            deger=deger.substring(1);
            int deger1=Integer.parseInt(deger);
            toplam+=deger1;
            sayac++;
        }while (sayac<=3);
        if (toplam>0)
            System.out.println(toplam);
        if (toplam<0)
            System.out.println(-1);


    }
}
