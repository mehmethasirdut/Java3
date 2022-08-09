package Gun17;

import java.util.Locale;
import java.util.Scanner;

public class Odev180522 {
    public static void main(String[] args) {


//        1-
//
//String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//
//Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//
//Eğer aitse "true" çevirin.

        String[] dizi1={"Apple", "Orange", "Banana", "Pineapple"};

        for(int i=0;i<dizi1.length; i++){
            if(dizi1[i].equals("Apple")==true)
                System.out.println(true);
        }


//2-
//
//int Array oluşturun ve elemanları : 12,2,5,15,8
//
//En büyük değeri yazdırınız.

        int[] dizi2={12,2,5,15,8};
        int max=dizi2[0];
        for (int i=0;i<dizi2.length;i++){
            if (dizi2[i]>max)
                max=dizi2[i];
        }
        System.out.println("dizinin en büyük değeri: "+max);

//3-
//
//int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//
//En küçük (minimum) sayıyı yazdırınız.

        int[] dizi3={14,19,5,21};
        int min=dizi3[0];
        for (int i=0;i<dizi3.length;i++){
            if (dizi3[i]<min)
                min=dizi3[i];
        }
        System.out.println("dizinin en küçük değeri: "+min);


//4-
//
//int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//
//Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi4={15,25,22,18,30};
        int max1=dizi4[0];
        int sayac=0;
        for (int i=0;i< dizi4.length;i++){
            if (dizi4[i]>max1){
                max1=dizi4[i];
            }
        }
        for (int i=0;i< dizi4.length;i++){
            if (max1!=dizi4[i])
                sayac++;
            else {sayac++;
                break;}
        }

        int max2=dizi4[0];
        for (int i=0;i<dizi4.length;i++){

            if (i==sayac-1)
                continue;

            if (dizi4[i]>max2){
                 max2=dizi4[i];

            }
        }
        System.out.println(max2+" dizinin 2. büyük elemanı");


//5-
//
//int Array oluşturun ve elemanları : 5,6,8,12,14,19
//
//Eğer sayı çiftse topla, tekse çıkar.
//
//**Örneğin:**
//
// **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//
//Toplamlarını yazdırın.

        int toplam1=0;
        int[] dizi5={5,6,8,12,14,19};
        for (int i=0;i<dizi5.length;i++){
            if (dizi5[i]%2==0)
                toplam1+=dizi5[i];
            if (dizi5[i]%2==1)
                toplam1-=dizi5[i];
        }
        System.out.println("çiftler ile teklerin farkı: "+toplam1);

//7-
//
//Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve
// int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
// Oluşturacağınız int array'i =   ([1, 2, 3, 4])
//
//Sonuç bu şekilde olmalıdır. [1, 4]

        int[] dizi6={1,2,3,4,5,6};
        int[] dizi7=new int[2];
        int i;
        for (i=0;i<dizi6.length;i++){
        if (i==0)
            dizi7[0]=dizi6[0];
        if (i== dizi1.length-1)
            dizi7[1]=dizi6[dizi6.length-1];
        }
        System.out.println("["+dizi7[0]+","+dizi7[1]+"]");


//8-
//
//int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//
//Array'in ortalamasını alınız.

        int[] dizi8={12,14,21,23,10,4};
        int sayac2=0;
        int toplam2=0;
        for (int j=0;j<dizi8.length;j++){
            sayac2++;
            toplam2+=dizi8[j];}
        int ortalama=toplam2/sayac2;
        System.out.println("Array'in ortalaması: "+ortalama);


//9-
//
//String Array (Dizi) oluşturunuz.
//
// elemanları : Apple, Orange , Banana, Kiwi
//
//Array'leri tüm elemanları yazdırınız.

        String[] dizi9={"Apple", "Orange","Banana", "Kiwi"};
        for (int k=0;k<dizi9.length;k++ )
            System.out.println("Array'in "+(k+1)+". elemanı "+dizi9[k]);


//10-
//
//String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//
//Array'daki eleman sayısını yazdırınız.
//
//Cevap 4 olmalı.

        String[] dizi10={"new jersey","new york", "boston", "California"};
        int sayac3=0;
        for (int k=0;k<dizi10.length; k++)
            sayac3++;
        System.out.println("Cevap "+sayac3);




//11-
//
//İnt Array oluştur ve elemanları   : 25,30,30,35,100
//
//Array in elemanlarının toplamını yazdır.
//
//Cevap 220 olmalı.

        int[] dizi11={25,30,30,35,100};
        int toplam3=0;
        for (int k=0;k<dizi11.length; k++)
            toplam3+=dizi11[k];
        System.out.println("Cevap "+toplam3);



//12-
//
////1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
//// Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.

        Scanner oku= new Scanner(System.in);
        String[] dizi12=new  String[5];

        for (int k=0;k<dizi12.length; k++){
            System.out.println((k+1)+". kelimeyi giriniz");
            dizi12[k]=oku.nextLine();
            System.out.println((k+1)+". kelime "+dizi12[k]);
            System.out.println("---------------------------------------");
        }

        int enuzun=dizi12[0].length();

        for (int k=0;k<dizi12.length;k++){
            if (enuzun<dizi12[k].length())
                enuzun=dizi12[k].length();
        }
        System.out.println("en uzun kelimeli stringin uzunluğu "+enuzun );
        int sayac4=0;
        for (int k=0;k<dizi12.length;k++){
            if (enuzun!=dizi12[k].length())
                sayac4++;
            else break;

        }
        System.out.println("index " +sayac4+"de yer alıyor");
        System.out.println("değiştirilmeden önceki hali : "+dizi12[sayac4]);


        char ilkkarakter=dizi12[sayac4].charAt(0);
        char sonkarakter=dizi12[sayac4].charAt(dizi12[sayac4].length()-1);

        String orta=dizi12[sayac4].substring(1 , dizi12[sayac4].length()-1);

        System.out.println("değiştirildikten sonraki hali : "+sonkarakter+orta+ilkkarakter);


        }

    }

