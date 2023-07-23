
import java.util.Scanner;

 class RewardValue {
    private double cashvalue;
    private double milesvalue;

    // Constructor  accepts a cash value
    public RewardValue(double cashValue) {
        cashvalue = cashValue;
        milesvalue = convertCashToMiles(cashValue);

    }

    // Constructor accepts  a miles value
    public RewardValue(double milesValue, boolean ismiles) {
        if (ismiles) {
            milesvalue = milesValue;
            cashvalue = convertMilesToCash(milesvalue);
        } else {
            throw new IllegalArgumentException("Invalid argument this accpeting true for ismiles");
        }
    }
    // This converts cash to miles value
    private double convertCashToMiles(double cashvalue) {
        return cashvalue / 0.0035;
    }


    public double getCashValue() {
        return cashvalue;
    }

    public double getMilesValue() {
        return milesvalue;
    }
    // This converts miles to cash value
    private double convertMilesToCash(double milesvalue) {
        return milesvalue * 0.0035;
    }
}
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
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}