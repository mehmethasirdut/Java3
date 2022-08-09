package Gun38.Odevleri.Soru4;

import java.util.ArrayList;

public class Amazon implements deliveryOptions {
    private int AmazonMinFreeDelivery=10000;
    private int sepet;


    @Override
    public int getTheTotal(ArrayList<String> liste) {

        for (String alinan:liste) {

            alinan = alinan.replace("$", "");
            int alinan1 = 0;
            if (alinan.contains("K")) {
                alinan = alinan.replaceAll("[A-Z]", "");
                alinan1 = Integer.parseInt(alinan) * 1000;
            }

            sepet += (Integer.parseInt(alinan)+alinan1);
        }
        return sepet;
    }

    @Override
    public String isFreeShipping(ArrayList<String> liste) {

        if (sepet>AmazonMinFreeDelivery)
            return "you are eligible for free delivery";
        else
            return "you need to buy "+ (AmazonMinFreeDelivery-sepet)+" amount of item.";

    }

}
