package Gun39.Odevler.Soru3;

import java.util.ArrayList;

public abstract class Phone {
    static ArrayList<String> card =new ArrayList<>();

    static int getSum( ArrayList<String> card){

        int toplam=0;
        for (String h :card){
            toplam = toplam+Integer.parseInt(h.substring(1));
        }return toplam;
    }

    public abstract void option(String s1,String s2);

}
