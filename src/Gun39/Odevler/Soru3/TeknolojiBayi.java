package Gun39.Odevler.Soru3;

import java.util.Scanner;

public class TeknolojiBayi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Apple - Kaç gb hafıza istiyorsunuz? 64 veya 128 GB : ");
        String st1= oku.nextLine();
        System.out.print("Apple - Kaç inch ekran istiyorsunuz? 5.5 veya 6.5 Inch : ");
        String st2= oku.nextLine();

        Apple apple = new Apple();
        apple.option(st1,st2);

        System.out.print("Samsung - Kaç gb hafıza istiyorsunuz? 256 veya 512 GB : ");
        String st3= oku.nextLine();
        System.out.print("Samsung - Kaç inch ekran istiyorsunuz? 5.5 veya 6.5 Inch : ");
        String st4= oku.nextLine();

        Samsung samsung=new Samsung();
        samsung.option(st3,st4);



        System.out.println("$"+Phone.getSum(Phone.card));

    }
}
