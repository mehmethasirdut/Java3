package Gun33.BigWorks1;

public class work1 {
    public static void main(String[] args) {
        /*
        1- Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
gönderiniz.
1 2 3 2 3 → 1.dizi : 1,2,3 2.Dizi : 2,3 => true
10 20 3 1 2 → 1.dizi : 10 20 3 2.Dizi : 1,2 => false
1 2 3 1 2 → 1.dizi : 1 2 3 2.Dizi : 1 2 => true
         */
                                        // birinci dizi
        int[] dizi1={1,2,3};
        int[] dizi2={2,3};
        int sayac=0;
        for (int i=0;i< dizi2.length;i++)
            for (int j=0;j<dizi1.length;j++)
                if (dizi2[i]==dizi1[j])
                    sayac++;
        if (sayac==2)
            System.out.println(true);
        else System.out.println(false);
        System.out.println();
                                        // ikinci dizi
        int[] dizi11={10,20,3};
        int[] dizi22={1,2};
        int sayac1=0;
        for (int i=0;i<dizi22.length;i++)
            for (int j=0;j<dizi11.length;j++)
                if (dizi11[j]==dizi22[i])
                    sayac1++;
        if (sayac1==2)
            System.out.println(true);
        else System.out.println(false);
        System.out.println();
                                        // üçüncü dizi
        int[] dizi111={1,2,3};
        int[] dizi222={1,2};
        int sayac2=0;
        for (int i=0;i<dizi111.length;i++)
            for (int j=0; j<dizi222.length;j++)
                if (dizi111[i]==dizi222[j])
                    sayac2++;
        if (sayac2==2)
            System.out.println(true);
        else System.out.println(false);


    }
}
