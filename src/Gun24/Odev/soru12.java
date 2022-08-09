package Gun24.Odev;

import java.util.Collections;
import java.util.HashSet;

public class soru12 {
    public static void main(String[] args) {

        /*
        12-

changeSet() isminde bir method oluşturun.

Parametre olarak bir String HashSet   ve  iki String

return hashset olmalı

Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

**ÖRNEK:**

hashset = "banana" , "strawberry" , "kiwi" , "pineapple"

String 1 = **banana**

String 2 = **peach**

**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
         */

        HashSet<String> list=new HashSet<>();
        Collections.addAll(list, "banana" , "strawberry" , "kiwi" , "pineapple");
        String a="banana";
        String b= "peach";
        System.out.println(list);
        System.out.println("değiştirildikten sonraki durum: "+changeSet(list, a, b));
    }
    public static HashSet<String> changeSet(HashSet<String> list, String a, String b){
        HashSet<String> degis=new HashSet<>();

        degis.addAll(list);
        degis.remove(a);
        degis.add(b);

        return degis;

    }
}
