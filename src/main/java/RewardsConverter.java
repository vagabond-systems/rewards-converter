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
        System.out.println("Converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        
        System.out.println("Enter a value in miles to convert to cash: ");
        input_value = scanner.nextLine();
        double milesValue;
        try {
            milesValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("Converting " + input_value + " miles to cash");
        rewardsValue = new RewardValue(milesValue, true);
        System.out.println(input_value + " miles is worth $" + rewardsValue.getCashValue());
    }
}

class RewardValue {
    private static final double CASH_TO_MILES_RATE = 100;   // Conversion rate: $1 = 100 miles
    private static final double MILES_TO_CASH_RATE = 0.0035; // Conversion rate: 1 mile = $0.0035

    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CASH_TO_MILES_RATE;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
