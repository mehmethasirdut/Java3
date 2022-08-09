package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        /*
        4-
İsmi changelnArraylist() olan bir method oluşturun.

Parametre olarak String ArrayList, String s1, String s2

   Arraylist'te s1'i s2 olarak değiştirin

Return String arrayList

Örneğin;

Arraylist  "yellow" , "red" , "blue" , "red" , "blue"

s1 = blue

s2 = yellow

Tüm blue 'ları yellow'a dönüştürün.

cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
         */
        Scanner read=new Scanner(System.in);
        ArrayList<String> liste =new ArrayList<>();
        Scanner read1=new Scanner(System.in);
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=read1.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". stringi giriniz");
            liste.add(read.nextLine());
        }
        System.out.println(liste);
        System.out.println("değiştirmek istediğiniz string nedir?");
        String s1=read.nextLine();
        System.out.println("hangi string ile değiştirmek istersiniz?");
        String s2=read.next();

        System.out.println("değişti: "+changelnArrayList(liste,s1,s2));


    }
    public static ArrayList<String> changelnArrayList(ArrayList<String> liste, String s1, String s2){

        ArrayList<String> listeNew=new ArrayList<>();

        for (int i=0;i<liste.size();i++)
            if (liste.get(i).equals(s1))
                listeNew.add(s2);
            else listeNew.add(liste.get(i));




        return listeNew;

    }
}
