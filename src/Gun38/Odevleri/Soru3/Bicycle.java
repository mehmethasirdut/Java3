package Gun37.Odevleri.Soru3;

public class Bicycle implements IVehicle{

    private int speed;
    private int gear;
    @Override
    public int changeGear(int vitesgec) {
        return gear+=vitesgec;
    }

    @Override
    public int speedUp(int hızartisi) {
        return speed+=hızartisi;
    }

    @Override
    public int applyBrakes(int frenyap) {
        return speed-=frenyap;
    }

    public Bicycle(int speed, int gear) {
        setSpeed(speed);
        setGear(gear);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    public void printAll(){
        System.out.println("current speed is "+ speed+" gear count is "+ gear);
    }
}
