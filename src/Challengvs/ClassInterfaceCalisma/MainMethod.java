package Challengvs.ClassInterfaceCalisma;

import java.util.ArrayList;

public class MainMethod {
    public static void main(String[] args) {

        TeslaCar tesla=new TeslaCar("Model S", 310);
        ToyotaPrius toyota=new ToyotaPrius("Pirus", 1200);
        BusDiesel bus=new BusDiesel("IVECO",7000);

        ArrayList<Vehicle> araclar=new ArrayList<>();
        araclar.add(tesla);
        araclar.add(toyota);
        araclar.add(bus);

        for (Vehicle vehicle:araclar){

            System.out.println(vehicle.getClass().getSimpleName());
            System.out.println("-----------------------");
            System.out.println("vehicle = " + vehicle.getModel());
            System.out.println("vehicle = " + vehicle.getEngine());

            if (vehicle instanceof TeslaCar){
                System.out.println(((TeslaCar)vehicle).drive());
                System.out.println(((TeslaCar)vehicle).ChangeButtery());
            }
            if (vehicle instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius)vehicle).drive());
                System.out.println(((ToyotaPrius)vehicle).ChangeButtery());
                System.out.println(((ToyotaPrius)vehicle).ChangeOil());
            }
            if (vehicle instanceof BusDiesel){
                System.out.println(((BusDiesel)vehicle).drive());
                System.out.println(((BusDiesel)vehicle).ChangeDiesel());
            }
            System.out.println();
        }




    }
}
