import java.util.Scanner;

class RewardValue {
    private double cash;
    private double miles;
    private double mtocrate = 0.0035;

    RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / mtocrate;
    }

    RewardValue(int miles) {
        this.miles = miles;
        this.cash = this.miles * mtocrate;
    }

    double getCashValue() {
        return this.cash;
    }


    double getMilesValue() {
        return this.miles;
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