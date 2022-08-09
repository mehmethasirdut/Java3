package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        /*
        5-
rotateList() isminde bir method oluşturun.

Parametre olarak String ArrayList

ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)

Tersten yazılmış halini return edin.

Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"


cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
         */

        Scanner StRead=new Scanner(System.in);
        ArrayList<String> liste =new ArrayList<>();
        Scanner IntRead=new Scanner(System.in);
        System.out.println("arraylist kaç elemanlı olsun?");
        int uzunluk=IntRead.nextInt();
        for (int i =1;i<=uzunluk;i++) {
            System.out.println(i+". stringi giriniz");
            liste.add(StRead.nextLine());
        }

        System.out.println(liste);
        System.out.println("ters string: "+rotateList(liste));

    }

    public static ArrayList<String> rotateList(ArrayList<String> liste){

        ArrayList<String> tersListe=new ArrayList<>();

        for (int i=liste.size()-1;i>=0;i--)
            tersListe.add(liste.get(i));

        return tersListe;


    }
}
