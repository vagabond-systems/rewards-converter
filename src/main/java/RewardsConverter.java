import java.util.Scanner;
import java.util.*;

public class RewardsConverter {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        RewardValue test1 = new RewardValue(145657);
        System.out.println(test1.getCashValue());
        RewardValue test2 = new RewardValue(254.38);
        System.out.println(test2.getMilesValue()
        );
    }
}