package Gun24.Odev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class soru13 {
    public static void main(String[] args) {
        /*
        13-

commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.

return tipi arraylist olmalı.

**ÖRNEĞİN:**

    İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**

     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**

Ortak değerleri ArrayListe ekleyiniz.

çıktı:  "Germany" , "Brazil" ,"USA"

ArrayListi yazdırınız.
         */
        HashSet<String> list1=new HashSet<>();
        Collections.addAll(list1, "Germany", "England", "South Africa", "Brazil", "USA");
        HashSet<String> list2=new HashSet<>();
        Collections.addAll(list2, "Germany", "China", "Brazil", "France", "USA");
        System.out.println(commonValues(list1, list2));

    }
    public static ArrayList<String> commonValues(HashSet<String> list1, HashSet<String> list2){
        ArrayList<String> ortak=new ArrayList<>();
        ortak.addAll(list1);
        ortak.retainAll(list2);

        return ortak;
    }
}
