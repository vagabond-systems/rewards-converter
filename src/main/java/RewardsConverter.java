import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.println("Please enter a cash value to convert to airline miles: ");
            String input_value = scanner.nextLine();
            double cashValue = Double.parseDouble(input_value);
            System.out.println("converting $" + input_value + " to miles");
            RewardValue rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
