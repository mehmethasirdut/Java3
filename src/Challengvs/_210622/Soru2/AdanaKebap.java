package Challengvs._210622.Soru2;

public class AdanaKebap implements Food {

    void Marinade(){
        System.out.println("Sipariş üzerine Adana Kebap marine ediliyor");
    }
    void Grill(){
        System.out.println("Adana Kebap ızgarada");
        System.out.println("Adana Kebap servise hazır...");
        System.out.println("AFİYET OLSUN :)");
    }

    @Override
    public void taste() {
        System.out.println("Adana Kebap tercihiniz için teşekkürler bölgenin en lezzetlisidir");
    }

    @Override
    public double ucret() {

        return 55;
    }

    @Override
    public String toString() {
        return "Adana Kebap";
    }
}
