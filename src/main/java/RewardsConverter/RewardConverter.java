package RewardsConverter;

import java.util.Scanner;

public class RewardConverter {

    public static void main(String[] args) {
        // Assume you have a conversion rate
        double conversionRate = 0.1;

        // You can provide the cash value directly or take it as user input
        double cashValue = 100.0;  // You can also replace this line with user input

        // Convert cash to miles
        System.out.println("Converting $" + cashValue + " to miles with a conversion rate of " + conversionRate);
        var rewardsValue = new RewardValue(cashValue, conversionRate);
        System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
