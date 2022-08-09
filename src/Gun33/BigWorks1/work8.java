package Gun33.BigWorks1;

import java.util.Arrays;
import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
        /*
        8- Verilen String arrayde;
    String arrayi ters çeviriniz.
    ters arrayi yazdırınız.
    NOT:
    Arrays.toString(your_array_name); <--- kullanınız.
         */

        Scanner read=new Scanner(System.in);
        System.out.print("array kaç elemanlı olsun=");
        int dizilength=read.nextInt();
        int[] dizi=new int[dizilength];

        for (int i=0;i<dizilength;i++){
            System.out.print((i+1)+". eleman=");
            dizi[i]=read.nextInt();
        }
        System.out.println();
        System.out.print("ilk hali="+ Arrays.toString(dizi));
        System.out.println();
        int[] tersdizi=new  int[dizilength];
        int sayac=0;
        for(int i=dizilength-1;i>=0;i--){
            tersdizi[sayac]=dizi[i];
            sayac++;
        }
        System.out.println();
        System.out.println("ters hali="+Arrays.toString(tersdizi));


    }
}
