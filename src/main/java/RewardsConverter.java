import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;

        // Define RewardValue class outside of main method
        class RewardValue {
            private double cashValue;
            private int milesValue;
        
            // Constructor accepting cash value
            public RewardValue(double cashValue) {
                this.cashValue = cashValue;
                this.milesValue = (int) (cashValue / 0.0035);
            }
        
            // Constructor accepting miles value
            public RewardValue(int milesValue) {
                this.milesValue = milesValue;
                this.cashValue = milesValue * 0.0035;
            }
        
            // Method to get cash value
            public double getCashValue() {
                return cashValue;
            }
        
            // Method to get miles value
            public int getMilesValue() {
                return milesValue;
            }
        }

        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        // Instantiate RewardValue class
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
