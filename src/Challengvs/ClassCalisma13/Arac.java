package Challengvs.ClassCalisma13;

public class Arac {

    private String renk;
    private String motor;
    private String model;

    public Arac(String renk, String motor, String model) {
        setRenk(renk);
        setModel(model);
        setMotor(motor);

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor='" + motor + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
