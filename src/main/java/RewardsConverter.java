import java.util.Scanner;
import RewardValuePackage.RewardValue;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // scanner used to get user input save as scanner
        System.out.println("Welcome to the Credit Card Rewards Converter!"); // output to user
        System.out.println("Please enter a cash value to convert to airline miles: "); // output to user
        var input_value = scanner.nextLine(); // reads next line of text assign to input value
        double cashValue; // define cashvalue as double type

        try {
            cashValue = Double.parseDouble(input_value); // take the input value which is type string converts to double
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue); // creates new rewardvalue instance using construcotr, assign the
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
