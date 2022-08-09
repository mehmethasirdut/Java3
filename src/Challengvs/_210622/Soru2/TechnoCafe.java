package Challengvs._210622.Soru2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner intSC=new Scanner(System.in);
        Scanner StrSC=new Scanner(System.in);
//        ArrayList<Food> liste=new ArrayList<>();
//        int i=0;
//        int toplamucret=0;
        String secenek="";
//        System.out.println("----------MENÜ-----------");
//
//        do {
//            System.out.println("Ne yemek istersiniz?");
//            System.out.println("1- Adana Kebap");
//            System.out.println("2- Lahmacun");
//            System.out.println("3- Borsh");
//            System.out.println("4- Palov");
//            int sayi=intSC.nextInt();
//            switch (sayi){
//                case 1:
//                    AdanaKebap ak=new AdanaKebap();
//                    liste.add(ak);
//                    System.out.println(ak.ucret()+" TL");
//                    toplamucret+=ak.ucret();
//                    ak.taste();
//                    ak.Marinade();
//                    ak.Grill();
//                    i++;
//                    break;
//                case 2:
//                    Lahmacun l=new Lahmacun();
//                    liste.add(l);
//                    System.out.println(l.ucret()+" TL");
//                    toplamucret+=l.ucret();
//                    l.taste();
//                    l.Dough();
//                    l.addMeat();
//                    l.bake();
//                    i++;
//                    break;
//                case 3:
//                    Borsh b=new Borsh();
//                    liste.add(b);
//                    System.out.println(b.ucret()+" TL");
//                    toplamucret+=b.ucret();
//                    b.taste();
//                    b.boil();
//                    b.eatTomorrow();
//                    i++;
//                    break;
//                case 4:
//                    Palov p=new Palov();
//                    liste.add(p);
//                    System.out.println(p.ucret()+" TL");
//                    toplamucret+=p.ucret();
//                    p.taste();
//                    p.fry();
//                    p.boil();
//                    i++;
//                    break;
//                default:
//                    System.out.println("belirtilen şekilde yemek bulunmamaktadır");break;
//            }
//            System.out.println("başka yemek ister misiniz?");
//            secenek=StrSC.nextLine();
//
//        }while (!secenek.equals("hayır"));
//
//        System.out.println(liste.size()+" adet yiyecek talep ettiniz");
//        System.out.println("toplam ücret= "+toplamucret);
//        System.out.println("Gelecek olan sipariş "+liste+" afiyet olsun");
        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------

        AdanaKebap ak1=new AdanaKebap();
        Lahmacun l1=new Lahmacun();
        Borsh b1=new Borsh();
        Palov p1=new Palov();
        ArrayList<String> yemeklistesi=new ArrayList<>();

        int sayac=0;
        int toplamucret1=0;
        String secenek1="";
        System.out.println("----------MENÜ-----------");

        do {
            System.out.println("Ne yemek istersiniz?");
            System.out.println("1- Adana Kebap");
            System.out.println("2- Lahmacun");
            System.out.println("3- Borsh");
            System.out.println("4- Palov");
            int sayi=intSC.nextInt();
            switch (sayi){
                case 1:
                    ak1.taste();
                    yemeklistesi.add("Adana Kebap");
                    System.out.println(ak1.ucret()+" TL");
                    toplamucret1+=ak1.ucret();
                    sayac++;
                    break;
                case 2:
                    l1.taste();
                    yemeklistesi.add("Lahmacun");
                    System.out.println(l1.ucret()+" TL");
                    toplamucret1+=l1.ucret();
                    sayac++;
                    break;
                case 3:
                    b1.taste();
                    yemeklistesi.add("Borsh");
                    System.out.println(b1.ucret()+" TL");
                    toplamucret1+=b1.ucret();

                    sayac++;
                    break;
                case 4:
                    p1.taste();
                    yemeklistesi.add("Palov");
                    System.out.println(p1.ucret()+" TL");
                    toplamucret1+=p1.ucret();
                    sayac++;
                    break;
                default:
                    System.out.println("belirtilen şekilde yemek bulunmamaktadır");break;
            }
            System.out.println("başka yemek ister misiniz?");
            secenek=StrSC.nextLine();

        }while (!secenek.equals("hayır"));

        System.out.println("-----Sipariş Bilgileri------");
        System.out.println(yemeklistesi.size()+" adet yiyecek talep ettiniz");
        System.out.println("toplam ücret= "+toplamucret1);
        System.out.println("Gelecek olan sipariş "+yemeklistesi+" afiyet olsun");
        System.out.println();
        System.out.println("SİPARİŞLER MUTFAĞA VERİLİYOR...");
        System.out.println();
        System.out.println("----------Techno Mutfak------------");
        for (String yiyecek:yemeklistesi) {
            if (yiyecek.equals("Adana Kebap")){
                System.out.println();
                ak1.Marinade();
                ak1.Grill();
            }
            if (yiyecek.equals("Lahmacun")){

                System.out.println();
                l1.Dough();
                l1.addMeat();
                l1.bake();
            }
            if (yiyecek.equals("Borsh")){
                System.out.println();
                b1.boil();
                b1.eatTomorrow();
            }

            if (yiyecek.equals("Palov")){
                System.out.println();
                p1.taste();
                p1.fry();
                p1.boil();
            }

        }

    }
}
