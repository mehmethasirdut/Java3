package Gun24.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        /*
        9-

rangeBtw() isminde bir method oluşturun.

Parametre olarak   **bir Arraylist**  ve **iki ayrı int**

return tipi int

 Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.

return  **count**       (sayacı (count) döndürün.)

**Example (Örnek):**

ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28

min = 20

max = 30

return =  5    (20,22,25,28,30)

min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)

         */
        ArrayList<Integer> list=new ArrayList<>();
        Scanner read=new Scanner(System.in);
        System.out.println("arrayin uzunluğu kaç olsun? : ");
        int uzunluk1=read.nextInt();

        for (int i=0;i<uzunluk1;i++){
            System.out.println((i+1)+". değeri giriniz");
            list.add(read.nextInt());
        }
        System.out.println("hangi değerler arasındaki eleman sayısını istiyorsunuz? ilk değeri giriniz: ");
        int ilk=read.nextInt();
        System.out.println("ikinci değeri giriniz");
        int iki=read.nextInt();

        System.out.println(list);
        System.out.println("array içerisinde istenilen "+ilk+" ile "+iki+" değer arasında " +rangeBtw(list, ilk, iki)+" kadar eleman vardır");

    }
    public static int rangeBtw(ArrayList<Integer> list, int ilk, int iki){
        int sayac=0;
        for (int i=0;i<list.size();i++)
            if (ilk<iki && list.get(i)<iki && list.get(i)>ilk)
                sayac++;
        return sayac;
    }
}
