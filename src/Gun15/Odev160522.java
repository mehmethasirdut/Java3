package Gun15;

import java.util.Scanner;

public class Odev160522 {
    public static void main(String[] args) {


        // 1-0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
        //_Not: 0 ve 100 dahildir._

        int sayac=1;
        for (int i=0;i<=100; i+=2){
            if(i%2==0)
                sayac++;

            System.out.println(sayac+" numaralı çift sayı "+i);
        }

        // 2- 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //
        //`Sonuç bu şekilde olmalıdır.`
        //
        //```
        //0
        //20
        //40
        //60
        //80
        //100
        //```

        for(int i=0; i<=100; i++){
            if(i%4==0 && i%5==0)
                System.out.println(i);
        }

        // 3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen 10 adet sayı giriniz");
        int sayac1=1;
        int toplam=0;
        for(int i=1; i<=10; i++){

            System.out.println(sayac1+" numaralı değeri giriniz");
            int sayi=oku.nextInt();
            if (sayi%2==0){
                toplam+=sayi;
                System.out.println("toplam"+toplam);}
            if(sayi%2==1)
                break;
            sayac1++;
        }
        System.out.println(sayac1+" numaralı değer tek olduğundan program sonlandı");
        System.out.println("çift girilen değerlerin toplamı "+toplam);

        // 4- Kullanıcının gireceği bir sayının kaç basamaklı olduğunu bulunuz

        Scanner oku1=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");

        // birinci yöntem basit olan

        String sayi1=oku1.next();
        int uzunluk=sayi1.trim().length();
        System.out.println("girilen değer "+uzunluk+" basamaklıdır");

        // ikinci yöntem zor olan :)

        System.out.println("bir sayı giriniz: ");
        int sayi2=oku1.nextInt();
        sayi2=sayi2-sayi2%10;
        int sayi3=sayi2;
        int onluk=1;
        int sayac2=1;
        for (int i=0;i<=sayi2;i++){
            if (sayi2==0) {
                System.out.println("sayı 1 basamaklı bir rakamdır");
                break;
            }

            if(sayi3>0){
                onluk*=10;
                int deger=((sayi3/onluk)%10)*onluk;
                sayi3= sayi3-deger;
                sayac2++;
            } else
                break;
        }
        if(sayac2>1)
            System.out.println("girilen sayı "+sayac2+" basamaklıdır");

        // 5- Kullanıcının girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığını bulunuz

        Scanner oku2=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");

        // birinci yöntem kolay olan

        String sayi4=oku2.next();
        if (sayi4.length()==1)
            System.out.println("girilen değer bir rakamdır");
        else if (sayi4.length()>1) {
            char birinci = sayi4.charAt(sayi4.length() - 1);
            char sonuncu = sayi4.charAt(0);
            if (birinci == sonuncu)
                System.out.println("birinci ve sonuncu basamakları eşittir");
            else System.out.println("birinci ve sonuncu basamakları eşit değildir");
        }


        // ikinci yöntem zor olan

        System.out.println("bir sayı giriniz: ");
        int sayi5=oku2.nextInt();
        int birinci =sayi5%10;
        int deger1=sayi5-sayi5%10;
        if (deger1==0)
            System.out.println("girilen değer bir rakamdır");
        else{
            int carpim=1;
            int sonbasamak=1;
            for(int i=1; i<=sayi5; i++){
                carpim=carpim*10;
                int deger2=((sayi5/carpim)%10)*carpim;
                if (sayi5>0){
                    sonbasamak=(sayi5/carpim)%10;
                    sayi5-=deger2;
                }
                else break;
            }
            if (birinci==sonbasamak)
                System.out.println("birinci ve son basamak eşit");
            else
                System.out.println("birinci ve son basamak eşit değil");
        }

        // 6-Kullanıcının gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz

        Scanner oku3=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");

        // kolay olan

        String sayi6=oku3.nextLine();
        if(sayi6.length()==1)
            System.out.println("girilen sayı bir rakamdır tersi de aynı sayıdır");
        else{

            for(int i=sayi6.length()-1;i>=0; i--){
                System.out.print(sayi6.substring(i,i+1));
            }

        }

        System.out.println();

        // zor olan

        System.out.println("bir sayı giriniz: ");
        int sayi7=oku3.nextInt();
        int deger=sayi7-sayi7%10;
        if (deger==0)
            System.out.println("girilen değer bir rakamdır ve tersi de aynı sayıdır.");
        else {
            int terssayi=0;

            while(sayi7>0){
                terssayi=terssayi*10;
                terssayi=terssayi+sayi7%10;
                sayi7=sayi7/10;

            }
            System.out.println("girilen değerin tersi: "+terssayi);
        }

        // 7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)

        Scanner sc = new Scanner(System.in);
        System.out.println("bir text giriniz");
        String text = sc.nextLine();

        if (text.contains("a") == true){
            int uzunluk2 = text.length();
            int sayac3 = 0;
            if (uzunluk2 > 1) {
                for (int i = 0; i < text.length(); i++) {
                    String tarama = text.substring(i, i + 1);
                    if (tarama.equals("a"))
                        sayac3++;
                }
                System.out.println("text içerisinde "+sayac3 + " adet a harfi vardır.");
            }
        }
        else
            System.out.println("girilen textin içinde a harfi yoktur");

        // 8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

        Scanner sc1 = new Scanner(System.in);
        System.out.println("bir text giriniz");
        String text1 = sc1.nextLine();
        text1=text1.trim();

        if (text1.contains(" ") == true){
            int sayac4 = 1;
            for (int i = 0; i < text1.length(); i++) {
                String tarama = text1.substring(i, i + 1);
                if (tarama.equals(" "))
                    sayac4++;
            }
            System.out.println("text içerisinde "+(sayac4) + " adet kelime vardır.");
        }

        else
            System.out.println("girilen textin içinde 1 adet kelime vardır");

        // 9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)

        Scanner sc2 = new Scanner(System.in);
        System.out.println("bir text giriniz");
        String text3 = sc2.nextLine();

        char ilkkelime2=text3.charAt(0);

        if(text3.contains(" ")==true){
            System.out.print(text3.charAt(0));
            for(int i=0;i<text3.length(); i++){

                String tarama1=text3.substring(i,i+1);
                if (tarama1.equals(" "))
                    System.out.print(text3.charAt(i+1));
            }
        }else System.out.println(ilkkelime2+" girilen cümlenin baş harfidir ");



        // 10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.

        Scanner sc3=new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz");
        int a=sc3.nextInt();
        int min=a;
        int sayac5=2;
        do{
            System.out.println("lütfen "+sayac5+". sayıyı giriniz");
            int b=sc3.nextInt();

            if(b<min)
                min=b;
            else break;
            sayac5++;
        }while (sayac5<=10);

    }

}
