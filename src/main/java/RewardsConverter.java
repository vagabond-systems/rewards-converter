import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
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
            var rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        }
    }
}

class RewardValue {
    public static double MILES_TO_CASH_CONVERSION_RATE;
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
