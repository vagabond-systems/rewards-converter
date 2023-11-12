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
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

        // this part is added to illustrate the getCashValue on the CLI
        System.out.println();
        var scanner1 = new Scanner(System.in);
        System.out.println("This Rewards Converter can also convert miles to cash value!");
        System.out.println("Please enter a miles value to convert to cash value: ");
        var input_value1 = scanner1.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(input_value1);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as an integer, exiting");
            return;
        }
        System.out.println("converting " + input_value1 + " miles to cash value");
        var rewardsValue1 = new RewardValue(milesValue);
        System.out.println(input_value1 + " miles is worth $" + rewardsValue1.getCashValue() + ".");

    }
}