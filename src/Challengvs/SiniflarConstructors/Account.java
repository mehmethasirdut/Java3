package Challengvs.SiniflarConstructors;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("yeni bakiye= "+bakiye);
    }
    public void paraCek(double miktar){
        if (miktar>1500)
            System.out.println("bir günde 1500 tl den fazla para çekemezsiniz");
        if (bakiye-miktar<0)
            System.out.println("yeterli bakiye yok");
        else {bakiye-=miktar;
            System.out.println("yeni bakiyeniz="+bakiye);}
    }

  //  public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){



  //  }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

}
