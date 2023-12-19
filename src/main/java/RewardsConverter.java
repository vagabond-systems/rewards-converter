import java.util.Scanner;
import java.math.BigDecimal;

/**
 * The RewardsConverter class is a utility for converting cash values to airline miles
 * in a credit card rewards program. It interacts with users, takes cash input, and
 * outputs the equivalent miles.
 */
public class RewardsConverter {

    /**
     * Main method to run the Rewards Converter application.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input for cash value

        try (scanner) {
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.println("Please enter a cash value to convert to airline miles:");
            String input = scanner.nextLine();
            // Parse input and convert to miles
            double cashValue = Double.parseDouble(input);
            BigDecimal milesValue = convertCashToMiles(cashValue);

            // Display result
            System.out.printf("$%.2f is equivalent to %.2f miles.%n", cashValue, milesValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        }
    }

    /**
     * Converts a given cash value to airline miles based on the current conversion rate.
     *
     * @param cashValue The cash value to convert.
     * @return The equivalent miles as a BigDecimal.
     */
    static BigDecimal convertCashToMiles(double cashValue) {
        if (cashValue < 0) {
            throw new IllegalArgumentException("Cash value cannot be negative.");
        }

        RewardValue rewardsValue = new RewardValue(cashValue);
        return rewardsValue.getMilesValue();
    }
}
