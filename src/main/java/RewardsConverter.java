import java.util.Scanner;
import java.math.BigDecimal;

public class RewardsConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Convert your cash to airline miles easily.");
        System.out.println("Type 'exit' anytime to quit the application.");

        while (true) {
            try {
                System.out.println("\nEnter a cash value to convert to airline miles:");
                String input = scanner.nextLine().trim();

                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Exiting... Thank you for using the Rewards Converter.");
                    break;
                }

                if (!input.matches("\\d+(\\.\\d+)?")) {
                    System.out.println("Invalid input. Please enter a positive number or 'exit' to quit.");
                    continue;
                }

                double cashValue = Double.parseDouble(input);
                BigDecimal milesValue = convertCashToMiles(cashValue);

                System.out.printf("$%.2f is equivalent to approximately %.2f miles.%n", cashValue, milesValue);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    static BigDecimal convertCashToMiles(double cashValue) {
        if (cashValue < 0) {
            throw new IllegalArgumentException("Cash value cannot be negative. Please enter a positive value.");
        }

        RewardValue rewardsValue = new RewardValue(cashValue);
        return rewardsValue.getMilesValue();
    }
}
