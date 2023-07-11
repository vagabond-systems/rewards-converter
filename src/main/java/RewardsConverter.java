import java.util.Scanner;
class RewardValue {

    public double cash;
    public int miles;
    public RewardValue(int miles){
        this.miles=miles;
    }
    public RewardValue(double cash){
        this.cash=cash;
    }
    public double getCashValue(){

        return (double)miles*0.0035;
    }
    public int getMilesValue(){
        double ans=cash/0.0035;
        return (int)ans;
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