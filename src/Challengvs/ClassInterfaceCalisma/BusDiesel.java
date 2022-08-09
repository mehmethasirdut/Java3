package Challengvs.ClassInterfaceCalisma;

public class BusDiesel extends Vehicle implements IDiesel {


    public BusDiesel(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeDiesel() {
        return "bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "şehir içine girme, ve yavaş sür, yolcuları rahatsız etme";
    }
}
