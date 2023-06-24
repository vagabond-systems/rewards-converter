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
        System.out.println("Converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

        // Adding additional code to test the reverse conversion from miles to cash
        System.out.println("Please enter a miles value to convert to cash: ");
        var miles_input_value = scanner.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(miles_input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse miles input value as an integer, exiting");
            return;
        }
        System.out.println("Converting " + miles_input_value + " miles to cash");
        var rewardsValueFromMiles = new RewardValue(milesValue);
        System.out.println(miles_input_value + " miles is worth $" + rewardsValueFromMiles.getCashValue());
    }
}
