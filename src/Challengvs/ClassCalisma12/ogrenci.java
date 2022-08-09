package Challengvs.ClassCalisma12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ogrenci {
    int id;
    static String name;
    String surname;
    static int sayac=0;

    public ogrenci(String name, String surname) {
        this.id = ++sayac;
        this.name = name;
        this.surname = surname;
    }

    public ogrenci(int ID,String name,String surname){

        this.id=ID;
        this.name=name;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void bilgigetir(){

        System.out.println("Öğrenci işlemleri menüsüne hoşgeldiniz");
        Scanner intread=new Scanner(System.in);
        Scanner strread=new Scanner(System.in);
        Map<Integer,ogrenci> okul=new TreeMap<>();
        TreeSet<Integer> IDkayit=new TreeSet<>();

        int secim;
        do{
            System.out.println("---işlem seçiniz---");
            System.out.println("1- öğrenci ekle\n2- öğrenci sil\n3- öğrenci ara\n" +
                    "4- çıkış");
            secim=intread.nextInt();
            switch (secim){
                case 1:
                    if(IDkayit.isEmpty()){
                        System.out.print("öğrenci adi=");
                        String isim=strread.nextLine();
                        System.out.print("öğrencinin soyadı=");
                        String soyisim=strread.nextLine();
                        ogrenci ogrekle=new ogrenci(isim,soyisim);
                        okul.put(ogrenci.sayac,ogrekle);
                        System.out.println(okul);}
                    else {
                        System.out.print("öğrenci adi=");
                        String isim=strread.nextLine();
                        System.out.print("öğrencinin soyadı=");
                        String soyisim=strread.nextLine();
                        ogrenci yeniogr= new ogrenci(IDkayit.first(),isim,soyisim);
                        okul.put(IDkayit.first(),yeniogr);
                        IDkayit.remove(IDkayit.first());
                        System.out.println(okul);
                    }
                    break;
                case 2:
                    System.out.print("kaydını silmek istediğiniz öğrencinin ID si=");
                    int silid=intread.nextInt();
                    okul.remove(silid);
                    System.out.println("silindikten sonraki "+okul);
                    IDkayit.add(silid);
                    break;
                case 3:
                    System.out.print("aramak istediğiniz öğrenicinin ismi=");
                    String isim=strread.nextLine();
                    for (Map.Entry<Integer,ogrenci> list: okul.entrySet())
                        if(list.getKey().equals(isim))
                            System.out.println("bulundu");
                    break;
                case 4:
                    System.out.println("program kapatılıyor...");
                    break;
                default:
                    System.out.println("yanlış seçim"); break;
            }

        }while(secim!=4);

    }

}
