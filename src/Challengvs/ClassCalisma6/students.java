package Challengvs.ClassCalisma6;

public class students {


    int id;
    String name;
    String surName;
    int classroom;

    public students(){

        this(0,"","",0);
      //  System.out.println("nesne oluşturuldu");
    }
    public students(int id, String name, String surName, int classroom){

        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;

    }

    public students(int id1, String name1, String surName1){

        this(id1, name1, surName1, 0);
    }

    public students(int id1, String name1){

        this(id1,name1,"",0);
    }

    public students(int id1){
        this(id1,"","",0);
    }

}
