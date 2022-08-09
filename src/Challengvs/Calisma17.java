package Challengvs;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calisma17 {
    public static void main(String[] args) {

        // Canlı sözlük yapılmak isteniyor
        // kullanıcıya aşağıdaki gibi bir menü çıkarınız
        // 1- ekleme(bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2 düzeltme(bu seçenekte kullanıcıya kelimenin manasını düzelttiriniz)
        //3- listeleme
        // 4- arama(bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- silme
        // 6-çıkış

        Scanner intread =new Scanner(System.in);
        Scanner Strread=new Scanner(System.in);
        System.out.println("------------------CANLI SÖZLÜĞE HOŞGELDİNİZ----------------------");

        Map<String, String> sozluk=new HashMap<>();
        int deger;
        do {

            System.out.println("1- Ekleme \n"+ "2- Düzeltme \n"+"3- Listeleme \n"
                    +"4- Arama \n"+"5- Silme \n"+"6- Çıkış " );
            System.out.println("hangi işlemi seçmek istersiniz? ");
            deger=intread.nextInt();

            switch (deger){
                case 1:
                    System.out.println("Merhaba eklemek istediğiniz kelime nedir?");
                    String ekle=Strread.nextLine();
                    System.out.println("anlamını giriniz");
                    String mana=Strread.nextLine();
                    sozluk.put(ekle,mana);
                    break;

                case 2:
                    System.out.println("düzeltmek istediğiniz kelime nedir?");
                    String duzeltme=Strread.nextLine();
                    System.out.println("anlamını giriniz");
                    String yenimana=Strread.nextLine();
                    sozluk.put(duzeltme, yenimana);
                    break;
                case 3:
                    System.out.println("girilen canlı sözlük= "+sozluk);
                    break;
                case 4:
                    System.out.println("aramak istediğiniz kelime nedir?");
                    String arama=Strread.next();
                    System.out.println("aradığınız "+sozluk.get(arama)+"kelimenin anlamı "+sozluk.values());
                    break;
                case 5:
                    System.out.println("silmek istediğiniz kelime nedir? ");
                    String silme=Strread.nextLine();
                    sozluk.remove(silme);
                    break;
                case 6:
                    System.out.println("çıkılıyor....");
                    break;
                default:
                    System.out.println("yanlış değer girdiniz");
                    break;

            }

        }while(deger!=6);

        System.out.println("HOŞÇAKALIN .... ");

    }
}
