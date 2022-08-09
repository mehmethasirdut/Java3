package Gun24.Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class soru10 {
    public static void main(String[] args) {

        /*
        10-

Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]

Store all the elements in one arraylist and print the arraylist

Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.

**Örnek:**

```
**Girdi:**
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
**Çıktı:** [1,2,3,4,5,6,7,8,9]
```
         */
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        ArrayList<Integer> giris1=new ArrayList<>();
        giris1.add(1);
        giris1.add(2);
        giris1.add(3);

        ArrayList<Integer> giris2=new ArrayList<>();
        giris2.add(4);
        giris2.add(5);
        giris2.add(6);

        ArrayList<Integer> giris3=new ArrayList<>();
        giris3.add(7);
        giris3.add(8);
        giris3.add(9);

        list.add(giris1);
        list.add(giris2);
        list.add(giris3);

        System.out.println(list);

        ArrayList<Integer> newList=new ArrayList<>();

        for (int i=0;i<list.size();i++)
            for (int j=0;j<list.get(i).size();j++)
                newList.add(list.get(i).get(j));

        System.out.println(newList);


    }
}
