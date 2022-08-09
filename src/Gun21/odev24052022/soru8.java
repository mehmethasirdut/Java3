package Gun21.odev24052022;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
//        8-
//
//                powerOfThree isminde bir method oluşturun.
//
//        Parametre olarak int
//
//        Return tipi boolean
//
//        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//
//                **Örnek 1:**
//
//```
//**Girdi:** 27
//                **Çıktı:** true
//```
//
//```
//        Açıklama: 3*3*3 =27
//```
//
//```
//        Sonuç= true
//
//```
//
//**Örnek 2:**
//
//```
//**Girdi:** 0
//                **Çıktı:** false
//```
//
//**Örnek 3:**
//
//```
//**Girdi:** 9
//                **Çıktı:** true
//```

        Scanner read=new Scanner(System.in);
        System.out.println("değer giriniz: ");
        int sayi=read.nextInt();

        System.out.println(powerOfThree(sayi));

    }

    public static boolean powerOfThree(int sayi){

        boolean donus=false;

        while(sayi>2)
            sayi=sayi/3;

        if (sayi==1)
            donus=true;

        return donus;
    }


}

