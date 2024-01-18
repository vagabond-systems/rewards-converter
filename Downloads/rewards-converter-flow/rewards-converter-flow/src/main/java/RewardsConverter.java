import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.print("Please enter a cash value to convert to airline miles: ");
            var input_value = scanner.nextLine();

            try {
                double cashValue = Double.parseDouble(input_value);
                System.out.println("Converting $" + input_value + " to miles");

                var rewardsValue = new main.java.RewardValue(cashValue, true);
                System.out.printf("$%.2f is worth %.2f miles%n", cashValue, rewardsValue.getMilesValue());
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a double. Please enter a valid number.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
