package Gun21.odev24052022;

import java.util.ArrayList;
import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

//        7-
//
//                addDigits isminde bir method oluşturun.
//
//        Parametresi int
//
//        Return tipi de int
//
//        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
//
//        Tek basamaklı çıktığında, döndürün
//
//                **Örnek1:**
//
//```
//**Girdi** `38`
//**Çıktı:** 2
//                **Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
//        2 , tek basamaklı olduğundan, bunu döndürün.
//```

        Scanner read=new Scanner(System.in);
        System.out.println("bir değer giriniz");
        int deger=read.nextInt();

        System.out.println(addDigits(deger));

    }

    public static int addDigits(int deger){

        ArrayList<Integer> dizi=new ArrayList<>();
        int i=1;
        int toplam=0;
        do {
            if (toplam>9){
            dizi.clear();
            deger=toplam;
            toplam=0;
            i=1;}

            do {
                int basamakdegeri = (deger / i) % 10;
                dizi.add(basamakdegeri);
                deger = deger - basamakdegeri * i;
                i = i * 10;

            } while (deger > 0);

            for (int j = 0; j < dizi.size(); j++) {
                toplam += dizi.get(j);
            }

        }while(toplam>9);

            return toplam;

    }
}
