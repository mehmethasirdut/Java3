package Challengvs.ClassInterfaceCalisma;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeButtery() {
        return "Batarya 50 yıl gider";
    }

    @Override
    public String drive() {
        return "tesla araç candır";
    }
}
