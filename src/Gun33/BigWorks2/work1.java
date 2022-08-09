package Gun33.BigWorks2;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        /*
        1- Parametresi int ve return tipi int olan power4 isminde method verilmiştir.
power4 metodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayınız.
Örnek:
parameter int is 1234
1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256
result 354 olmalı.
         */

        Scanner IntRead=new Scanner(System.in);
        System.out.print("bir değer giriniz=");
        int deger=IntRead.nextInt();
        System.out.println(power4(deger));

    }
    public static int power4(int deger){
        int toplam=0;

        if (deger/10==0)
            toplam=deger;
        if (deger/10>0){
            int deger1=deger;
            int i=1;
            int sayi=0;
            int sayac=1;
            do {
                sayi=(deger/i)%10;
                i*=10;
                deger=deger-sayi*i;
                sayac++;
            }while(deger>0);
            int sayi1=0;
            int j=1;
            do {
                sayi1=(deger1/j)%10;
                j*=10;
                toplam+=Math.pow(sayi1,sayac);

            }while(sayi1>0);
        }

        return toplam;
    }
}
