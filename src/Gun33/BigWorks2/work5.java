package Gun33.BigWorks2;

import java.util.HashSet;
import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        /*
        5- Parametresi Set String olan ve Set içindeki Stringlerin uzunluklarının toplamını döndüren
getTotalLength metodunu yazınız.
return total
Örnek:
Set String "repl" "is" "homework"
result 14 olmalı
NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİRİNİZ.
         */

        System.out.println(getTotalLength());
    }
    public static int getTotalLength(){
        HashSet<String> liste=new HashSet<>();
        Scanner strRead=new Scanner(System.in);
        Scanner intRead=new Scanner(System.in);
        System.out.print("arrayin uzunluğu=");
        int uzunluk=intRead.nextInt();
        int sayac=1;
        do {
            System.out.print(sayac+". elemanı giriniz=");
            liste.add(strRead.nextLine());
            sayac++;
        }while (sayac<=uzunluk);
        int toplam=0;
        if (uzunluk==0)
            return -1;
        if (uzunluk>0) {
            for (String a : liste) {
                toplam=toplam+a.length();
            }

        }
        return toplam;
    }
}
