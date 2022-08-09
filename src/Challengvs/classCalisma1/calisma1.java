package Challengvs.classCalisma1;

public class calisma1 {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.

        Rectangle benimdortgenim=new Rectangle();
        benimdortgenim.width=5;
        benimdortgenim.length=10;

        benimdortgenim.alan();
        benimdortgenim.cevre();
       // Rectangle.alan(benimdortgenim.width, benimdortgenim.length);
       // Rectangle.cevre(benimdortgenim.width, benimdortgenim.length);

    }

}
