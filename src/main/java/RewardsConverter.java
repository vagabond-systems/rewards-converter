import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        System.out.println("\nPlease enter distance value to covert to airline cash: ");
        var input_value2 = scanner.nextInt();
        double cashValue;       
        int milesValues;    //ADDED: miles values variable.
        try {
            cashValue = Double.parseDouble(input_value);
            milesValues = input_value2;     // Sets integer mile variable to second input 
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, or integer, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        
        /*Second prompt for converting miles to cash. */
        System.out.println("converting " + input_value2 + " miles to cash");
        var rewardsValue2 = new RewardValue(milesValues); 
        System.out.println(input_value2 + " miles is worth $" + rewardsValue2.getCashValue());
        
    }
}