package Gun39.Odevler.Soru3;

public class Apple extends Phone{

    @Override
    public void option(String s1, String s2) {
        if (s1.contains("64") && s2.contains("5.5"))
            card.add("$750");
        else if (s1.contains("64") && s2.contains("6.5"))
            card.add("$850");
        else if (s1.contains("128") && s2.contains("5.5"))
            card.add("$950");
        else if (s1.contains("128") && s2.contains("6.5"))
            card.add("$1200");
        else
            System.out.println("belirtilen şekilde Apple marka telefonumuz bulunmamaktadır");
    }
}
