import java.util.Scanner;

class RewardValue{
    private double cashValue;
    private int milesValue;
    private final double converstionfactor = 0.0035;
    RewardValue(double cashValue){this.cashValue = cashValue;
        this.milesValue= (int) (cashValue/converstionfactor);}
    RewardValue(int milesValue){this.milesValue = milesValue;
    this.cashValue = (double)(this.milesValue*converstionfactor);}

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
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