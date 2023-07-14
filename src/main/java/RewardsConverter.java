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
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.cashToMilesConverter(cashValue) + " miles");

        System.out.println("Please enter a miles value to convert to cash: ");
        var input = scanner.nextLine();
        int milesValue;
        try {
            milesValue = (int)(Integer.parseInt(input));
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as an integer, exiting");
            return;
        }
        System.out.println("converting " + input + " miles to $");
        var rewardsValue2 = new RewardValue(milesValue);
        System.out.println(input + " miles are worth $" + rewardsValue2.milesToCashConverter(milesValue));
    }

}