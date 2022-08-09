import java.util.Random;
import java.util.Scanner;

public class Calisma1 {

    public static void main(String[] args) {

        /*
        Scanner sayı = new Scanner(System.in);

        System.out.println("lütfen karenin bir kenarının uzunluğunu giriniz");


       int a = sayı.nextInt();

        int kareninçevresi=4*a;
        int kareninalanı=a*a;

        System.out.println("karenin çevresi = " + kareninçevresi + "\n"+ "karenin alanı = " + kareninalanı);
*/

/*
        Scanner sayı1 = new Scanner(System.in);
        double kilo = sayı1.nextDouble();
        int boy = sayı1.nextInt();
        double kitleendeksi= kilo/(boy*boy);

        System.out.println("ağırlık = "+ kilo+ "boy= "+ boy + "endeks= "+ kitleendeksi );
*/
        /*
        Scanner oku = new Scanner(System.in);
        System.out.println("kullanıcı adınız");
        String kullanıcıadı= oku.nextLine();
        System.out.println("şifrenizi giriniz");
        String şifre =oku.nextLine();
        System.out.println("kullanıcı adı "+kullanıcıadı+"şifre "+şifre);
*/
        /*
        Scanner oku= new Scanner(System.in);
        System.out.println("kaç bilet istediğinizi giriniz");
        byte biletsayisi= oku.nextByte();
        System.out.println("sigorta isteyip istemediğinizi giriniz örneğin true veya false");
        boolean sigorta=oku.nextBoolean();
        System.out.println("sigorta = " + sigorta);
        System.out.println("bilet sayısı = " + biletsayisi);
*/
        /*
        Scanner oku=new Scanner(System.in);
        System.out.println("oturduğunuz caddeyi giriniz");
        String cadde = oku.nextLine();
        System.out.println("sokağı giriniz");
        String sokak=oku.nextLine();
        System.out.println("posta kodunuzu giriniz");
        int pk=oku.nextInt();
        System.out.println("oturduğunuz cadde sokak ismi "+ cadde+"cadde "+sokak+"sokak" + "pk = " + pk);
*/


        Scanner oku = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=oku.nextLine();
        System.out.println("isim= "+isim); // 1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        System.out.println("lütfen herhangi bir sayı giriniz");
        int sayı=oku.nextInt();
        System.out.println("sayı = " + sayı); // 2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        oku.nextLine();
        System.out.println("sevdiğiniz meyveyi yazınız");
        String meyve=oku.nextLine();
        System.out.println("meyve = " + meyve); // 3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.println("arabanızdaki kapı sayısını giriniz");
        int SayiKapi=oku.nextInt();
        System.out.println("SayiKapi = " + SayiKapi); // 4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        oku.nextLine();
        System.out.println("10 sene önceki yaşadığın şehri yazın");
        String sehir=oku.nextLine();
        System.out.println("sehir = " + sehir); //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.println("Doğum gününüzü konsola giriniz");
        String dogum=oku.nextLine();
        System.out.println("dogum = " + dogum); // 6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.println("Bir Banka Hesabınız Var mı? (cevap true veya false)");
        boolean varMi=oku.nextBoolean();
        System.out.println("varMi = " + varMi); // 7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
                                                // Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        System.out.println("kg cinsinden bir ağırlık yazınız");
        byte kg = oku.nextByte();
        System.out.println("kg = " + kg); //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        System.out.println("boyunuzu giriniz");
        float boy=oku.nextFloat();
        System.out.println("boy = " + boy); // 9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.


    }
}
