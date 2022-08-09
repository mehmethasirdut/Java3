package Challengvs;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Calisma11 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> notlarlistesi=new ArrayList<>();

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(10);
        matNotlar.add(20);
        matNotlar.add(30);

        ArrayList<Integer> fizNotlar=new ArrayList<>();
        fizNotlar.add(50);
        fizNotlar.add(60);
        fizNotlar.add(70);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(60);
        kimNotlar.add(70);
        kimNotlar.add(80);

        notlarlistesi.add(matNotlar);
        notlarlistesi.add(fizNotlar);
        notlarlistesi.add(kimNotlar);


        notlarlistesi.get(0);
        notlarlistesi.get(0).get(0);

        for (int i = 0; i <notlarlistesi.size() ; i++) {
            System.out.println("notlarListesi "+notlarlistesi.get(i));

        }

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarlistesi.size(); i++) {

            System.out.println(dersler.get(i));

            for (int j=0;j<notlarlistesi.get(i).size();j++){
                System.out.println((i+1)+". yaprak,"+(j+1)+". not");
                System.out.println(notlarlistesi.get(i).get(j));}

            System.out.println();

        }

        // Kullanıcıdan alınan ders nosuna göre ekrana notların listesini bir fonksiyonda yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("ders no 0-mat 1-fiz 2-kim ");
        int dersNo=oku.nextInt();

        dersNotlarıYazdir(notlarlistesi, dersNo, dersler);


        // yukarıda girilen derse ait ortalamayı mainde yazdırınız
        
        dersNotlarıOrtalamasi(notlarlistesi, dersNo,dersler);
    }

    public static void dersNotlarıYazdir(ArrayList<ArrayList<Integer>> notlarListesi,int dersNo,ArrayList<String> dersler){

        System.out.println(dersler.get(dersNo));
        for (int i=0;i<notlarListesi.get(dersNo).size();i++)
            System.out.println(notlarListesi.get(dersNo).get(i));
    }
    
    public static void dersNotlarıOrtalamasi(ArrayList<ArrayList<Integer>> notlarlistesi,int dersNo,ArrayList<String> dersler){
        
        System.out.println(dersler.get(dersNo));
        int toplam=0;
        for (int i=0;i<notlarlistesi.get(dersNo).size();i++){
            toplam+=notlarlistesi.get(dersNo).get(i);
        }
        int ortalama=toplam/notlarlistesi.get(dersNo).size();
        System.out.println("ortalama = " + ortalama);
        
    }


}
