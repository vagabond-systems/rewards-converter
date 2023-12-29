import java.util.Scanner;

class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double x) {
        cashValue = x;
    }

    public RewardValue(int x) {
        milesValue = x;
    }

    public double getCashValue() {
        double u = 0.0035;
        double z = milesValue;
        double ans = u * z;
        return ans;
    }

    public int getMilesValue() {
        double u = 35;
        double v = cashValue;
        v = v * 10000;
        v = v / u;
        int ans = (int) v;
        return ans;
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
