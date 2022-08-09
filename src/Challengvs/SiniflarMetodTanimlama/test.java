package Challengvs.SiniflarMetodTanimlama;

public class test {
    public static void main(String[] args) {

        Araba araba1=new Araba();

        araba1.setModel("Renault");
        System.out.println(araba1.getModel());

        araba1.setKapilar(-4);

//        Araba araba2;
//        araba2.setKapilar(10);

        Araba araba3=null;
        araba3.setModel("Hyundai");
    }
}
