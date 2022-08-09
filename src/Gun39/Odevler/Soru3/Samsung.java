package Gun39.Odevler.Soru3;

public class Samsung extends Phone{

    @Override
    public void option(String s3, String s2) {
        if (s3.contains("256") && s2.contains("5.5"))
            card.add("$1000");
        else if (s3.contains("256") && s2.contains("6.5"))
            card.add("$1200");
        else if (s3.contains("512") && s2.contains("5.5"))
            card.add("$1300");
        else if (s3.contains("512") && s2.equalsIgnoreCase("6.5"))
            card.add("$1400");
        else
            System.out.println("belirtilen şekilde Samsung marka telefonumuz bulunmamaktadır");
    }
}
