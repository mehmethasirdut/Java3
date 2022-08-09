package Challengvs.ClassCalisma13;

public class Otobus extends Arac {
    private int yolcuSayisi;


    public Otobus(String renk, String motor, String model, int yolcuSayisi) {

        super(renk, motor, model);
        setYolcuSayisi(yolcuSayisi);



    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuSayisi=" + yolcuSayisi +" "+super.toString()+
                '}';
    }
}
