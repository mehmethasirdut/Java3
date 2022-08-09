package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        /*
        3-

getLength() isminde bir method oluşturun.

Parametre olarak String ArrayList

Return tipi Integer ArrayList

ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

Tüm elementlerin uzunluğunu döndürün

Örneğin;

ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"

Tüm Stringlerin uzunluklarını yazdırın;

cevap: 10 ,  8 , 4 , 7 , 6 olmalı
         */

        Scanner read=new Scanner(System.in);
        ArrayList<String> liste =new ArrayList<>();
        Scanner read1=new Scanner(System.in);
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=read1.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". Stringi giriniz");
            liste.add(read.nextLine());
        }

        System.out.print(getLength(liste));

    }
    public static ArrayList<Integer> getLength(ArrayList<String> liste){

        ArrayList<Integer> kargo=new ArrayList<>();

        for (int i=0;i<liste.size();i++)
            kargo.add(liste.get(i).length());

        return kargo;
    }
}
