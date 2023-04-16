import java.util.Scanner;

class RewardValue {
    private double cashValue;
    private double miles;

    // Constructor to initialize cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Getter method for miles.
    public double getMilesValue() {
        miles = cashValue / 0.035;
        return miles;
    }
}

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue = 0.0; // Initialize cashValue to 0.0

        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
