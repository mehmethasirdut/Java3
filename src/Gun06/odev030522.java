import java.util.Scanner;

public class odev030522 {
    public static void main(String[] args) {

        // 1- "I love java" olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.

        String kelime = "I love java";
        int KarakterSayisi= kelime.length();
        System.out.println("KarakterSayisi = " + KarakterSayisi);

        // 2- "Sprint planning" olan bir String oluşturun. Bu dizenin toplam karakter sayısını yazdırın.

        String kelime1 = "Sprint planning";
        int KarakterSayisi1 = kelime1.length();
        System.out.println("KarakterSayisi1 = " + KarakterSayisi1);

        // 3- "apple" olan bir String oluşturun. String'in içinde "app" olup olmadığını doğrula

        String kelime2="apple";
        boolean VarMi=kelime2.contains("app");
        System.out.println("VarMi = " + VarMi);

        // 4- "orange" kelimesinden oluşan bir String oluşturun. String'in "Apple" a eşit olup olmadığını doğrulayın

        String kelime3="orange";
        boolean EsitMi=kelime3.equals("Apple");
        System.out.println("EsitMi = " + EsitMi);

        // 5- "apple" olan bir String oluşturun. String'in "apple" a eşit olup olmadığını doğrulayın.
        // Büyük harf veya küçük harf önemli değildir.

        String kelime4="apple";
        boolean EsitMi1=kelime4.equalsIgnoreCase("apple");
        System.out.println("EsitMi1 = " + EsitMi1);

        // 6- "Florida" kelimesinden bir String oluşturun. Florida kelimesinin içindeki, sadece "o" harfinin bulunduğu indexini yazdırın
        String kelime5= "Florida";
        int GectigiIndex= kelime5.indexOf("o");
        System.out.println("Geçtiği index numarası =" + GectigiIndex);

        // 7- "Thank you" olan bir String oluşturun. Thank you içindeki, sadece "y" harfinin bulunduğu konumu yazdırın

        String kelime6= "Thank you";
        System.out.println("y harfinin bulunduğu konum = " + kelime6.indexOf("y"));

        // 8- "Main method" oluşturun. "Mouse" değerinde bir String oluştur. Mouse String'inin 3. sırasındaki karakteri yazdırın.

        String kelime7 = "Mouse";
        char sira3=kelime7.charAt(2);
        System.out.println("Mouse String'inin 3. sırasındaki karakteri = " + sira3);
        
        // 9- girilen tamAdSoyad'ın 2 kelimelik mi 3 kelimelik mi olduğunu nasıl anlarsınız.
        // bu soruda öncelikle ilk boşluğu sonrasında ikinci yani son boşluğun yerini bulmamız gerekmekte.
        // eğer ilk ve son değer eşit ise tek farklı ise iki boşluk bulunmakta. yani eşit ise tek isim değil ise iki isim vardır denilebilir.

        Scanner oku = new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı aralarda boşluk bırakarak giriniz= ");
        String tamAdSoyad= oku.nextLine();
        int a = tamAdSoyad.indexOf(" ");
        int b = tamAdSoyad.lastIndexOf(" ");
        System.out.println("iki kelimeden mi oluşuyor: "+(a==b));
        System.out.println("üç kelimeden mi oluşuyor: "+(a!=b));

        // 10- 3 kelimelik ismi olan kişinin ad, 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        Scanner AdSoyad= new Scanner(System.in);
        System.out.print("Lütfen 3 kelimeden oluşan bir isim soyisim giriniz= ");
        String isimSoyisim=AdSoyad.nextLine();
        char c=isimSoyisim.charAt(0);
        int d= isimSoyisim.indexOf(" ");
        char e=isimSoyisim.charAt(d+1);
        int f=isimSoyisim.lastIndexOf(" ");
        char g=isimSoyisim.charAt(f+1);
        System.out.println("istenilen= " +c+"."+e+"."+g+".");

    }
}
