import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        int milesValue;



        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

        System.out.println("Convert Miles to Cash value. Input miles.");
        var miles_value = scanner.nextLine();

        try {
            milesValue = Integer.parseInt(miles_value);
        }catch (NumberFormatException exception){
            System.out.println("Could not parse input to int, exiting");
            return;
        }
        System.out.println("converting " + milesValue + " Miles to cash value.");
        var convertedToCash = new RewardValue(milesValue);

        System.out.println(milesValue + "miles is worth $" + convertedToCash.getCashValue());

    }
}