package Gun34.OdevSorulari.Soru3;

public class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private uyelik whichMember;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getDoYouWanaSubscribe()
    {
        return doYouWanaSubscribe;
    }
    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe){
        this.doYouWanaSubscribe=doYouWanaSubscribe;
    }
    public uyelik getWhichMember(){
        return whichMember;
    }
    public void setWhichMember(uyelik whichMember){
        if (whichMember==uyelik.GOLD)
            System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
        else if (whichMember==uyelik.SILVER)
            System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
        else if (whichMember==uyelik.BRONZE)
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
        else
            System.out.println("See you when you want to be a member. Thanks");
    }


}
