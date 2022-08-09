package Gun38.Odevleri.Soru4;

import java.util.ArrayList;
import java.util.Collections;

public class Costco implements deliveryOptions  {

    private int CostcoMinFreeDelivery=15000;
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
        if (sepet> CostcoMinFreeDelivery)
            return "you are eligible for free delivery";
        else
            return "you need to buy "+ (CostcoMinFreeDelivery-sepet)+" amount of item.";
    }
}
