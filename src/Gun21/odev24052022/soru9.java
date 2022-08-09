package Gun21.odev24052022;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class soru9 {
    public static void main(String[] args) {


//        9-
//
//                Write a method called `append`
//
//`append adında bir method oluşturun.`
//
//`Parametre olarak iki int array  oluşturun.`
//
//        ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//
//                Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//
//                Bunu döndürmelidir:
//
//        {2, 4, 6, 1, 2, 3, 4, 5}.
//
//#

        ArrayList<Integer> liste1=new ArrayList<>();
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);
        liste1.add(4);
        ArrayList<Integer> liste2=new ArrayList<>();
        liste2.add(5);
        liste2.add(6);
        liste2.add(7);
        liste2.add(8);
        System.out.println(append(liste1,liste2));

    }

    public static ArrayList<Integer> append(ArrayList<Integer> liste1, ArrayList<Integer> liste2){

        for (int i=0;i<liste1.size();i++)
            liste2.add(liste1.get(i));

        return liste2;



    }
}
