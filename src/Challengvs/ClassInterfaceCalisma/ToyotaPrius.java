package Challengvs.ClassInterfaceCalisma;

public class ToyotaPrius extends Vehicle implements IGas,IElectric{


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeButtery() {
        return "ömür boyu kullan";
    }

    @Override
    public String ChangeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "hem elektrik hem oil iyisin :)";
    }
}
