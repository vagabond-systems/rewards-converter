package src;
import java.util.Scanner;

public class RewardsConverter {

    public static class RewardValue{

        double cashValue;
        int miles;
        RewardValue(double cashValue){
            this.cashValue = cashValue;
            this.miles = (int)(cashValue / 0.0035);
        }

        RewardValue(int milesValue){
            this.cashValue = milesValue * 0.0035;
            this.miles = milesValue;
        }

        public double getMilesValue(){
            return miles;
        }
        public double getCashValue(){
            return cashValue;
        }
    }

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