package Challengvs.ClassCalisma9;

public class Hesap {

    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void parayatir(int sayi)
    {
        this.bakiye+=sayi;
        this.yatan+=sayi;

    }

    public void paracek(int sayi){
        if (this.bakiye<sayi)
            System.out.println("bakiye yetersiz");
        else {
            this.bakiye-=sayi;
            this.cekilen+=sayi;
        }

    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
