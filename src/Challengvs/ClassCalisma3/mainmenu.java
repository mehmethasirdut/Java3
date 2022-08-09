package Challengvs.ClassCalisma3;

import javax.rmi.CORBA.Util;

public class mainmenu {
    public static void main(String[] args) {
        // 1. yöntem javanın kendi metodlarıyla yapılan çevirme işi
        int sayi =345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);
        //2. yöntem kendi sınıfımı yazayım ve ordan kullanayım.(Nesne özelliği olarak)
        Utility util =new Utility();
        strRakam=util.getString(sayi);
        intRakam=util.getInt(strRakam);
        //3. yöntem (Clas özelliği olarak)
        Math.max(3,4);
        strRakam= Utility.getString2(sayi);
        intRakam=Utility.getInt2(strRakam);


        System.out.println("strRakam = " + strRakam);
        System.out.println("intRakam = " + intRakam);

    }
}
