package Gun33.BigWorks1;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
        /*
        10- String 2D array oluşturunuz.
    {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
    String de $ varsa 3.2 ile çarpın
    String de € varsa 4.2 ile çarpın
    double return ediniz.
         */

        Scanner intread=new Scanner(System.in);
        System.out.print("satır sayisi =");
        int satir= intread.nextInt();
        System.out.print("sütun sayisi =");
        int sütun=intread.nextInt();
        Scanner strread=new Scanner(System.in);
        String[][] dizi=new String[satir][sütun];
        double[][] dizi1=new double[satir][sütun];
        Double deger1=0D;

        for (satir=0;satir<dizi.length;satir++) {
            for (sütun = 0; sütun < dizi[satir].length; sütun++) {
                System.out.println((satir + 1) + ". satir " + (sütun + 1) + ". sütun=");
                String deger = strread.nextLine();
                if (deger.contains("$")) {
                    deger = deger.replace("$", "");
                    deger1 = Double.parseDouble(deger) * 3.2D;
                    dizi1[satir][sütun] = deger1;
                } else if (deger.contains("€")) {
                    deger = deger.replace("€", "");
                    deger1 = Double.parseDouble(deger) * 4.2D;
                    dizi1[satir][sütun] = deger1;
                }
                else{
                    System.out.println((satir+1)+". satir "+(sütun +1)+". sütundaki paranın cinsini belirtmediniz " +
                            "atama işlemi yapılmadı");
                    System.out.println();
                }
            }
        }
        for(satir=0;satir<dizi1.length;satir++)
            for(sütun=0;sütun<dizi1[satir].length;sütun++)
                System.out.println(satir+","+sütun+"= " + dizi1[satir][sütun]);

    }
}
