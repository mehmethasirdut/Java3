package Challengvs.ClassCalisma6;

import Gun28._03_Soru.Student;

public class okul {
    public static void main(String[] args) {

        students ogr1=new students();
        ogr1.id= 259;
        ogr1.name="Mehmet";
        ogr1.surName="Haşir";
        ogr1.classroom=5;
        System.out.println("ogr1.name= "+ogr1.name);

        students ogr2=new students();
        ogr2.id= 1;
        ogr2.name="a";
        ogr2.surName="b";
        ogr2.classroom=4;
        System.out.println("ogr2.name= "+ogr2.name);

        students ogr3=new students();
        ogr3.id= 3;
        ogr3.name="c";
        ogr3.surName="d";
        ogr3.classroom=3;
        System.out.println("ogr3.name= "+ogr3.name);

        students ogr4=new students();
        ogr4.id= 4;
        ogr4.name="e";
        ogr4.surName="f";
        ogr4.classroom=2;
        System.out.println("ogr4.name= "+ogr4.name);

        students ogr5=new students();
        ogr5.id= 5;
        ogr5.name="g";
        ogr5.surName="h";
        ogr5.classroom=1;
        System.out.println("ogr5.name= "+ogr5.name);

        students ogr6=new students();
        ogr6.id= 6;
        ogr6.name="i";
        ogr6.surName="j";
        ogr6.classroom=6;
        System.out.println("ogr6.name= "+ogr6.name);

        students ogr7=new students();
        ogr7.id= 7;
        ogr7.name="k";
        ogr7.surName="l";
        ogr7.classroom=7;
        System.out.println("ogr7.name= "+ogr7.name);

        // constructions lar
        students ogr8=new students(8,"m","n",8);
        System.out.println("ogr8.name= "+ogr8.name);

        students ogr9=new students(9, "o", "p", 9);
        System.out.println("ogr9.name = " + ogr9.name);
        
        students ogr10=new students(10,"r","s");
        System.out.println("ogr10.name = " + ogr10.name);
        
        students ogr11= new students(11, "t");
        System.out.println("ogr11.name = " + ogr11.name);
        
        students ogr12=new students(12);
        System.out.println("ogr12.id = " + ogr12.id);


    }
}
