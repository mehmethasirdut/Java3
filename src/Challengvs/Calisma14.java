package Challengvs;

import java.util.HashMap;
import java.util.Map;

public class Calisma14 {
    public static void main(String[] args) {

        Map<Integer, Integer> m=new HashMap<>(); // key i ve value si INTEGER olan bir MAP

        m.put(2, 11); // 2 keyine 11 atandı
        m.put(3,12);
        m.put(6,15);
        m.put(2,5); // 2 anahtarındaki değeri güncelledik

        System.out.println("m= "+m);
        System.out.println("m.get(2)=" +m.get(2)); // 2 anahtarındaki değer
        System.out.println("m.keySet()"+m.keySet()); // m.keySet() =
        System.out.println("m.values()= "+m.values()); // m.values() =

        for (Integer k:m.keySet())
            System.out.println("k= "+k);
        for (Integer v: m.values())
            System.out.println("v= "+v);


        for (Map.Entry<Integer, Integer> anahtarValue:m.entrySet())
        {
            System.out.println("anahtarValue.getKey()= "+anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }

        System.out.println("m.containsKey(2)= "+m.containsKey(2));
        System.out.println("m.containsValue(12) = "+m.containsValue(12));
        m.remove(2);// 2 anahtarındaki her şey siliniyor hem key hem value
        System.out.println("m = "+m);
        System.out.println("m.keySet().size() = " + m.keySet().size());
        m.clear();
        System.out.println("m = " + m);


    }
}
