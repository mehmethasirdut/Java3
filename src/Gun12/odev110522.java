package Gun12;

import java.util.Scanner;

public class odev110522 {
    public static void main(String[] args) {



        //  1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        // bu sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("ondalıklı sayının tam kısmını giriniz: ");
        String tam=oku.nextLine();
        System.out.print("ondalıklı sayının ondalıklı kısmını giriniz: ");
        String ondalik=oku.nextLine();
        System.out.println("istenilen ondalıklı sayı= "+tam.concat("."+ondalik));

        // 2- Girilen bir sayı
        // Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        // Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        Scanner oku1=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi=oku.nextInt();
        if (sayi%9==0 && sayi%5==0){
            System.out.println("Able to divide by 9 and 5");
        }
        if (sayi%4==0&&sayi%5==0){
            System.out.println("Able to divide by 4 and 5");
        }

        // 3- Girilen 3 sayıdan en küçük olanını bulunuz.

        Scanner oku2=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        int ilk=oku2.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int iki =oku2.nextInt();
        System.out.print("üçüncü sayıyı giriniz: ");
        int uc=oku2.nextInt();
        int enk=ilk;
        if (enk>iki){
            enk=iki;
        }
        if (enk>uc){
            enk=uc;
        }
        System.out.println("küçük sayı "+enk+"dir");

        /*
        4-Girilen bir string

        Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.

        Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.

        Aksi halde (else) "no money" yazdırın.
        */

        Scanner oku3= new Scanner(System.in);
        System.out.print("bir string giriniz: ");
        String tutar=oku3.nextLine();
        if (tutar.contains("€")){
            System.out.println("This is euro");
        }else
            if (tutar.contains("$")){
                System.out.println("This is dollar");
            }else{
                System.out.println("no money");
            }

/*
        5-Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.

        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A

        Eğer ortalama not >= 70% ve<90% => not=B

        Eğer ortalama not >=50% ve <70% =>not=C

        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:

        int Quiz_score: 80

        int mid_term_score: 68

        int Final_score: 90

        print (Your grade is B)

          (Notunuz B'dir)

         */

        Scanner oku4=new Scanner(System.in);
        System.out.print("lütfen sınav notunuzu giriniz: ");
        int sinav=oku4.nextInt();
        System.out.print("lütfen ara sınav notunuzu giriniz: ");
        int arasinav=oku4.nextInt();
        System.out.print("lütfen final notunuzu giriniz: ");
        int finalsinav=oku4.nextInt();
        double ortalama=(sinav+arasinav+finalsinav)/3;
        if(ortalama>=90){
            System.out.println("A Tebrikler!");
        }else
            if(ortalama>=70&&ortalama<90){
                System.out.println("B");
            }else
                if(ortalama>=50&&ortalama<70){
                    System.out.println("C");
                }else {
                    System.out.println("F KALDINIZ :(");
                }


    }
}
