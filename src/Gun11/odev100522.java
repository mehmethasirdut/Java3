package Gun11;

import java.util.Scanner;

public class odev100522 {
    public static void main(String[] args) {

        // 1- Girilen 3 sayıdan büyük olanı yazdırınız.

        // örnek çözüm 1
        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        int sayi1=oku.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();
        System.out.print("üçüncü sayıyı giriniz: ");
        int sayi3 = oku.nextInt();

        if(sayi1>sayi2&&sayi1>sayi3){
            System.out.println(sayi1);
        }
        if(sayi2>sayi1&&sayi2>sayi3){
            System.out.println(sayi2);
        }
        if (sayi3>sayi1&&sayi3>sayi2){
            System.out.println(sayi3);
        }

        // örnek çözüm 2

        Scanner oku1 = new Scanner(System.in);
        System.out.print("sayi1= ");
        int sayi11 = oku.nextInt();
        System.out.print("sayi2=");
        int sayi22 = oku.nextInt();
        System.out.print("sayi3=");
        int sayi33 = oku.nextInt();
        int enbuyuk=sayi11;
        if (sayi22>enbuyuk)
        { enbuyuk=sayi22;

        }
        if (sayi33>enbuyuk){
            enbuyuk=sayi33;

        }
        System.out.println("en buyuk"+enbuyuk);

        // 2- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup olmadığını kontrol ediniz.

        Scanner oku2 = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int alinan= oku2.nextInt();
        if (alinan%10==1 && (alinan/10)%10==1 && alinan%10 == (alinan/10)%10){
            System.out.println("girilen sayının birler ve onlar basamağı hem tek hem de eşit");
        }else {
            System.out.println("girilen sayı istenileni sağlamadı");
        }

        // 3- Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.

        Scanner oku3= new Scanner(System.in);
        System.out.println("bir text giriniz: ");
        String text=oku3.nextLine();
        if (text.contains(" ") || text.contains("A")){
            System.out.println("uygundur");
        }else{
            System.out.println("uygun değildir");
        }

    }
}
