import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Enter cash value to convert to miles");
        System.out.println("2. Enter miles value to convert to cash");

        var choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Please enter a cash value to convert to airline miles: ");
                var cashInput = scanner.nextLine();
                double cashValue;
                try {
                    cashValue = Double.parseDouble(cashInput);
                } catch (NumberFormatException exception) {
                    System.out.println("Could not parse input value as a double, exiting.");
                    return;
                }
                var rewardInMiles = new main.java.RewardValue(cashValue);
                System.out.println("$" + cashInput + " is worth " + rewardInMiles.getMilesValue() + " miles.");
                break;

            case "2":
                System.out.println("Please enter a miles value to convert to cash: ");
                var milesInput = scanner.nextLine();
                double milesValue;
                try {
                    milesValue = Double.parseDouble(milesInput);
                } catch (NumberFormatException exception) {
                    System.out.println("Could not parse input value as a double, exiting.");
                    return;
                }
                var rewardInCash = new main.java.RewardValue(milesValue, true);
                System.out.println(milesInput + " miles is worth $" + rewardInCash.getCashValue() + ".");
                break;

            default:
                System.out.println("Invalid choice, exiting.");
        }
    }
}
