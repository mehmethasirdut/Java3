package Gun37.Odevleri.Soru3;

public class MainClass {
    public static void main(String[] args) {
        /*
        3-
Vehicle class interface'i (arayüz) yap.

    3 adet method oluşturun.

Birinci method ismi changeGear   parametresi 1 adet int.

     İkinci method ismi speedUp parametresi 1 adet int.

        Üçüncü method ismi applyBrakes parametresi 1 adet int.

Bicycle class Vehicle'a implementing ediliyor.

        2 adet int oluşturun. speed ve gear

2 methodu Override edin.

    3 methodun hepsini Vehicle interface'ine Override edin.

    variable gear'ı parameter gear'a eşitleyin.

speedUp methodunun içinde,

       speed variable'ını arttırın.

applyBreakes methodunun içinde,

       speed variable'ını azaltın.

printAll  isminde bir method oluşturunuz.

         print şu şekilde olmalıdır. > current speed is SPEED gear count is GEAR

not: SPEED  speed veriable'ıdır. GEAR  gear veriable'ıdır.

Car class Vehicle'a implementing ediliyor.

      2 adet int oluşturun. speed ve gear

2 methodu Override edin.

    3 methodun hepsini Vehicle interface'ine Override edin.

    variable gear'ı parameter gear'a eşitleyin.

speedUp methodunun içinde,

       speed variable'ını arttırın.

applyBreakes methodunun içinde,

       speed variable'ını azaltın.

printAll  isminde bir method oluşturunuz.

         print şu şekilde olmalıdır. > current speed is SPEED gear count is GEAR

not: SPEED  speed veriable'ıdır. GEAR  gear veriable'ıdır.

main method'un içinde;

Bicycle class ve Car class için object oluşturun.

 changeGear , speedUp  ,  applyBrakes method'larını Bicycle ve Car class'larında çağırın.

Önce Bicycle class'ındaki printAll'u çağırın

Sonra Car class'ındaki printAll'u çağırın.
         */


        Bicycle bicycle=new Bicycle(20,3);
        bicycle.changeGear(1);
        bicycle.speedUp(60);
        bicycle.applyBrakes(10);

        bicycle.printAll();
        System.out.println("------------------");

        Car car=new Car(100,4);
        car.speedUp(40);
        car.changeGear(1);
        car.applyBrakes(70);
        car.printAll();


    }
}
