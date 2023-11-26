import java.util.Scanner;
import java.lang.Math;

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

class RewardValue {
    double reward_cashvalue;
    int reward_milesValue;
    
    public RewardValue(double cashValue){
        reward_cashvalue = cashValue;
    }


    public RewardValue(int milesValue){
        reward_milesValue = milesValue; 
    }

    public double getCashValue(){
        if (reward_cashvalue == 0.0) return Math.round(reward_milesValue/0.0035);
        return reward_cashvalue;
    }
    public int getMilesValue(){
        if (reward_milesValue==0)
            return (int)(reward_cashvalue*0.0035);
        return reward_milesValue;
    }
}