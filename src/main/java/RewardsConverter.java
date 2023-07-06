import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert cash to miles");
        System.out.println("2. Convert miles to cash");
        System.out.print("Enter your choice (1 or 2): ");
        var choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter a cash value to convert to airline miles: ");
            var input_value = scanner.nextDouble();
            var rewardsValue = new RewardValue(input_value);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        } else if (choice == 2) {
            System.out.println("Please enter a miles value to convert to cash: ");
            var input_value = scanner.nextDouble();
            var rewardsValue = new RewardValue((int) input_value);
            System.out.println(input_value + " miles is worth $" + rewardsValue.getCashValue());
        } else {
            System.out.println("Invalid choice. Exiting.");
        }
    }
}