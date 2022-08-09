package Challengvs._210622.Soru2;

public class Borsh implements Food {
    void boil(){
        System.out.println("Sipariş üzerine Borsh kaynatılıyor");
    }
    void eatTomorrow(){
        System.out.println("Borsh hazır ancak yarın yerseniz daha lezzetli olur");
        System.out.println("Borsh servise hazır...");
        System.out.println("AFİYET OLSUN :)");
    }

    @Override
    public void taste() {
        System.out.println("Borsh tercihiniz için teşekkür ederiz");
    }

    @Override
    public double ucret() {
        return 33;
    }

    @Override
    public String toString() {
        return "Borsh";
    }
}
