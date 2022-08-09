package Challengvs._210622.Soru2;

public class Lahmacun implements Food{

    void Dough(){
        System.out.println("Sipariş üzerine Lahmacun hamuru hazırlanıyor");
    }
    void addMeat(){
        System.out.println("Lahmacun hamuruna et ekleniyor");
    }
    void bake(){
        System.out.println("Lahmacun pişiriliyor");
        System.out.println("Lahmacun servise hazır...");
        System.out.println("AFİYET OLSUN :)");
    }
    @Override
    public void taste() {
        System.out.println("Lahmacun tercihiniz için teşekkür ederiz");
    }

    @Override
    public double ucret() {
        return 33;
    }

    @Override
    public String toString() {
        return "Lahmacun";
    }
}
