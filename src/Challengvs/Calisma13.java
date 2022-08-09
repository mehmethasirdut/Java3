package Challengvs;

import java.lang.reflect.Array;
import java.util.*;

public class Calisma13 {
    public static void main(String[] args) {

        // SETS: HashSet(hızlı),
        // LinkedHashSet(ekleme sırasına göre sıralı)
        // TreeSet(her zaman sıralı)

        // hızlı çalışmak için kendi özel algoritma sırasına göre saklar

        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("bes");
        System.out.println("hs="+hs);
        
        // eklenme sırasına göre elemanlarını tutuyor

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);
        
        // alfabetik olarak sıralı tutar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts = " + ts);
        
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);
        System.out.println("ts2 = " + ts2);
        
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        System.out.println("renkler = " + renkler);//Ekrana yazdırma yöntemi
        
        // Ekrana tek tek yazdırma 2. yöntem

        for (String s :renkler) { // renklerin içindeki elemanları herhangi bir sıra ile s ismini vererek gönderiyor
            System.out.println("s = " + s);
        }

        // ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim. TreeSet ve LinkedSet

        for (String s: ts ) {//sırayı garanti etmiyor, sıra lazım değilse bunu kullan
            System.out.println("s = " + s);

        }

        Iterator gosterge=ts.iterator(); // sırayı garanti eder, sıra lazımsa bunu kullan

        while (gosterge.hasNext()){//set lerde kendi sırasına göre elemanlara ulaşmak için
            System.out.println("gosterge.next() = " + gosterge.next());//sıradaki elemanı gösteriyor
        }

        /* ÖZET
        int[] dizi=new int[5]; index var,
   fori(sıra garanti çünkü indexe göre ilerliyor),
   foreach(sıra garanti değil)
   for(int eleman:dizi)
       so eleman

ArrayList  index var,
   fori(sıra garanti çünkü indexe göre ilerliyor),
   foreach(sıra garanti değil)
   for(int eleman:dizi)
       so eleman

SET lerde
    INDEX YOK
    fori yok
    foreach(sıra garanti değil)
    garanti istiyorsan ITERATOR yöntemi
         */

        HashSet<Object> hss=new HashSet(); // istediğin tipi alır
        hss.add("bes");
        hss.add(5);
        hss.add("ismet");
        hss.add(4.5);
        hss.add(true);

        System.out.println("hss = " + hss);

        for (Object o:hss)// Object: bütün tiplerin atası, evrensel tip
            System.out.println("o = " + o);

        HashSet<Integer> hs2=new HashSet<>();
        hs2.add(1);
        hs2.add(5);
        hs2.add(7);
        hs2.add(34);
        hs2.add(3);
        System.out.println("hs2 = " + hs2);
        System.out.println("size ı= "+hs2.size());

        hs2.remove(1); // siler
        System.out.println("remove sonrası hs2 "+hs2);

        if (hs2.contains(5)) // boolean var mı?
            System.out.println("5 var");
        else System.out.println("5 yok");

        hs2.clear();// siler
        System.out.println("Clear sonrası hs2: "+hs2);


        // diziden hashset e geçiş
        Integer[] dizi=new Integer[]{1,2,3,4,5,6,6,7,7};
        System.out.println("dizi = "+ Arrays.toString(dizi));

        HashSet<Integer> hs3=new HashSet<>();
        for (int i = 0; i <dizi.length ; i++) {
            hs3.add(dizi[i]);

        }
        System.out.println("hs3= "+hs3);

        // 2. yöntem direk atış

        HashSet<Integer> hs4=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs4 "+hs4);




    }
}
