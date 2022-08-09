package Gun21.odev24052022;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {

//        6-
//
//                EvenOddNums isminde bir method oluşturun.
//
//        Bu yöntem String olan bir parametreyi kabul etsin.
//
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//
//                toplam sonucu yazdırın.
//
//**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//
//        For example Örnek:
//
//        String =  "6678421312"
//
//        6+6-7+8+4+2-1-3-1+2
//
//        sonuç 16 olmalı

        Scanner read=new Scanner(System.in);
        System.out.println("giriş: ");
        String deger=read.nextLine();

        EvenOddNums(deger);

    }

    public static void EvenOddNums(String girilen){

        String[] rakamlar=girilen.split("");
        int toplam=0;
        int sayi;
        for (int i=0;i< rakamlar.length;i++){
            sayi=Integer.parseInt(rakamlar[i]);
            if (sayi%2==0){
                toplam+=sayi;
            }else
                toplam-=sayi;
        }
        System.out.println(toplam);

    }
}
