import java.util.Scanner;

class RewardValue {
    private double val;
    public RewardValue(double val){
        this.val = val;
    }
    public double getMilesValue(){
        double miles = 0;
            miles = (val*10000)/35;
        return miles;
    }
    public double getCashValue(){
        double cash = 0;
            cash = 0.0035*val;
        return cash;
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