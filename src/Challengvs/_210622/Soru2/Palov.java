package Challengvs._210622.Soru2;

public class Palov implements Food{

    void fry(){
        System.out.println("Sipariş üzerine Palov yağda kızartılıyor");
    }
    void boil(){
        System.out.println("Palov suda haşlanıyor");
        System.out.println("Palov servise hazır...");
        System.out.println("AFİYET OLSUN :)");
    }
    @Override
    public void taste() {
        System.out.println("palov tercihiniz için teşekkür ederiz");
    }

    @Override
    public double ucret() {
        return 44;
    }

    @Override
    public String toString() {
        return "Palov";
    }
}
