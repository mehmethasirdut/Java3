package Challengvs.ClassCalisma10;

public class ogrenci {

    String name;
    String surname;
    static String okulAdi="yildirim ilk okulu";

    public ogrenci(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                '}';
    }
}
