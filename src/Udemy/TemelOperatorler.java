package Udemy;

public class TemelOperatorler {
    public static void main(String[] args) {
        // + - * /
        System.out.println(3+4.2);
        System.out.println(3-5);
        System.out.println(3-5f);
        System.out.println(10/4);
        System.out.println(10d/4);
        System.out.println(10/4.0); // bölüm
        System.out.println(3*4);
        System.out.println(10%4); // kalan

        int a=5;
        a+=5;
        int b=6;
        b-=1;

        a++; // postfix gösterim
        b--;

        ++a;//prefix gösterim
        --b;

        int c=5;
        System.out.println(c++); // güncellenmemiş hali şeklinde çıktı gelir

        //System.out.println(++c);// güncellenmiş hali şeklinde çıktı gelir

        // işlem sırası hangi işlemi önce yapmak istiyorsak parantez kullanacağız

        // çarpma ve bölme önce yapılır toplama ve çıkarma sonra yapılır







    }
}
