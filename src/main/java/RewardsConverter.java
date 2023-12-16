import java.util.Scanner;

public class RewardsConverter {
    public static class RewardValue {
        private double cashValue;
        private int milesValue;
    
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
        }
        
        public RewardValue(int milesValue) {
            this.cashValue = toCash(milesValue);
        }

        private static int toMiles(double cashValue) {
            return (int) (cashValue / 0.0035);
        }
    
        private static double toCash(int milesValue) {
            return milesValue * 0.0035;
        }
    
        public double getCashValue() {
            return cashValue;
        }
    
        public int getMilesValue() {
            return toMiles(this.cashValue);
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
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}