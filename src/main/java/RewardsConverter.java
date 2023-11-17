import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        // Convert cash to miles
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
        System.out.println("-----------------------------------------------------");
        System.out.println("Please enter a airline miles value to convert to cash value: ");
        var input_value2 = scanner.nextLine();
        double milesValue;
        try {
            milesValue = Double.parseDouble(input_value2);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        System.out.println("converting $" + input_value2 + " to cash");
        var rewardsValue2 = new RewardValue(milesValue,true);
        System.out.println("$" + input_value2 + " miles is worth $" + rewardsValue2.getCashValue());
        scanner.close();
    }

}re