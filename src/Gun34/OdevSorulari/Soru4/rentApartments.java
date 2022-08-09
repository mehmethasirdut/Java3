package Gun34.OdevSorulari.Soru4;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;


    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public String getName(){
        return name;
    }
    public int getRoomCount(){
        return roomCount;
    }
    public boolean getBalconyOrNo(){
        return balconyOrNo;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setRoomCount(int roomCount){
        this.roomCount=roomCount;

    }
    public int kira(){
        int kira=0;
        if (roomCount==0)
            kira=1400;
        else if (roomCount==1)
            kira=1700;
        else if (roomCount==2)
            kira=2200;
        else if (roomCount==3)
            kira=2700;
        else
            System.out.println("girilen şekilde oda bulunmamaktadır");
        return kira;
    }
    public int balkonluMu(boolean balconyOrNo){
        int ekle=0;
        if (balconyOrNo==true)
            ekle=200;
        return ekle;
    }

    public void setBalconyOrNo(boolean balconyOrNo){
        this.balconyOrNo=balconyOrNo;
    }

}
