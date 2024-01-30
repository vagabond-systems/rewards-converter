import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        // Prompt user for a cash value
        System.out.print("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();

        double cashValue;

        // Try to parse the input as a double
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        System.out.println("Converting $" + input_value + " to miles...");

        // Create RewardValue object
        var rewardsValue = new RewardValue(cashValue);

        // Display the conversion result
        System.out.printf("$%.2f is worth %.2f miles%n", cashValue, rewardsValue.getMilesValue());
    }
}
