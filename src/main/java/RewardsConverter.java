<<<<<<< HEAD
import RewardsConverter.java.RewardValue;

=======
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be
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
        System.out.println("converting $" + input_value + " to miles");
<<<<<<< HEAD
        RewardValue rewardsValue;
        rewardsValue = new RewardValue(cashValue);
=======
        var rewardsValue = new RewardValue(cashValue);
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}