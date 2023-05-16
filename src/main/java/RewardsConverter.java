import java.util.Scanner;

class RewardValue{
    private double cash_val=0;
    private int miles_val=0;
    private double CONV_RATE = 0.0035;

    public RewardValue(int miles) {
        this.miles_val = miles;
        this.cash_val = miles*this.CONV_RATE;
    }

    public RewardValue(double cash) {
        this.cash_val = cash;
        this.miles_val = (int)(this.cash_val/this.CONV_RATE);
    }

    public int getMilesValue() {
        return this.miles_val;
    }

    public double getCashValue() {
        return this.cash_val;
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