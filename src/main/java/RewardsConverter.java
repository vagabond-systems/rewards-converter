import java.util.Scanner;

class RewardValue{
    private double cash=0;
    private double mile=0;
    RewardValue(double cash)
    {
        this.cash=cash;
        this.mile=cash/0.0035;
    }
    RewardValue(int mile)
    {
        this.mile=mile;
        this.cash=mile*0.0035;
    }

    double  getCashValue()
    {
        return this.cash;
    }
    double  getMilesValue()
    {
        return this.mile;
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
            scanner.close();
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        scanner.close();
    }
}