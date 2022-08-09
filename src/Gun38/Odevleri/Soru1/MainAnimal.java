package Gun37.Odevleri.Soru1;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {

        Swallow s=new Swallow();
        Cat c=new Cat();
        Shark sh=new Shark();
        Duck dck=new Duck();

        ArrayList<IAnimal> hayvanlar=new ArrayList<>();
        hayvanlar.add(s);
        hayvanlar.add(c);
        hayvanlar.add(sh);
        hayvanlar.add(dck);

        for (IAnimal hayvan:hayvanlar){

            System.out.println(hayvan.getClass().getSimpleName());

            System.out.println("hayvan.food() = " + hayvan.food());
            System.out.println("-------------------");
            System.out.println();

        }


    }


}
