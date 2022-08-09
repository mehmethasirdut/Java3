package Challengvs.classCalisma5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;

    ArrayList<Lesson> dersleri= new ArrayList<>();

public void dersEkle(Lesson ders){
    int toplamAlinanKredi=0;
    for(Lesson l: dersleri)
        toplamAlinanKredi+=l.credit;
    if (toplamAlinanKredi+ders.credit<=maxCredit){
        dersleri.add(ders);
        System.out.println("Eklendi= "+ders.name);
    }
    else
        System.out.println("Alınabilecek kredi miktarı aşıldı= "+ders.name);
}
}
