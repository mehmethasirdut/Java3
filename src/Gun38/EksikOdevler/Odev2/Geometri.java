package Gun38.EksikOdevler.Odev2;

public class Geometri {
    public static void main(String[] args) {
        /*
        Kare, Dikdortken, ve daire sınıflarından oluşacak bir geometri programı
yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
(cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
         */

        Kare kare=new Kare();
        System.out.println("karenin alanı= "+kare.alan(5,5));
        System.out.println("karenin çevresi= "+kare.cevre(5,5));
        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println("dikdörtgenin alanı= "+dikdortgen.alan(3,3));
        System.out.println("dikdörtgenin çevresi= "+dikdortgen.cevre(3,3));
        Daire daire=new Daire();
        System.out.println("dairenin alanı= "+daire.alan(4));
        System.out.println("dairenin çevresi= "+daire.cevre(4));
    }
}
