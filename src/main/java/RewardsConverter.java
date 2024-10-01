import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        }
        catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        RewardValue cashReward = new RewardValue(10.0); // $10 reward
        System.out.println("Cash Value: $" + cashReward.getCashValue());
        System.out.println("Miles Value: " + cashReward.getMilesValue() + " miles");

        RewardValue milesReward = new RewardValue(1000); // 1000 miles reward
        System.out.println("Cash Value: $" + milesReward.getCashValue());
        System.out.println("Miles Value: " + milesReward.getMilesValue() + " miles");

    }
}