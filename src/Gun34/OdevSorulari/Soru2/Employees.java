package Gun34.OdevSorulari.Soru2;

import Gun34.OdevSorulari.Soru1.Ogrenci;

public class Employees {

    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){

        if (ageCalculator(dob)>18)
            System.out.println(name+" Welcome to our company your salary is "+salary);
        else if (ageCalculator(dob)<18)
            System.out.println("come back when you are 18 years old");
        else
            System.out.println("we can have inter with you after that you can have a "+salary+" salary");

    }
    public int ageCalculator(String dob){
        String text=dob.substring(6);
        int deger=Integer.parseInt(text);
        int employee=2022-deger;

        return employee;
    }


}
