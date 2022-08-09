package Gun24.Odev;

import sun.awt.image.ImageWatched;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class soru14 {
    public static void main(String[] args) {
        /*
        14-

removing() isminde bir method oluşturun.

Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.

Eğer Stringler LinkedHashset 'in içinde varsa, sil.

Return tipi linkedhashset

Örneğin,

linkedhashset : Germany , France , USA , Canada , Mexico , Brazil

String 1= Germany

String 2 = USA

 **Germany ve USA 'i sil.**

**Set'i döndür.**
         */
        LinkedHashSet<String> list=new LinkedHashSet<>();
        Collections.addAll(list, "Germany", "France", "USA", "Canada","Mexico", "Brazil");
        String a="Germany";
        String b="USA";
        System.out.println(list);
        System.out.println("yeni liste: "+removing(list, a,b));
    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> list, String a, String b ){

        LinkedHashSet<String> newList=new LinkedHashSet<>();
        newList.addAll(list);
        newList.remove(a);
        newList.remove(b);

        return newList;
    }
}
