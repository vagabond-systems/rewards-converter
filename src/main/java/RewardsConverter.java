import java.util.Scanner;

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
        System.out.println("$" + input_value + " is worth " + rewardsValue.convertCashToMiles(rewardsValue.getCashValue()) + " miles");

        //Miles to cash conversion
        System.out.println("-----------------------------------");
        System.out.println("Please enter the amount of miles you want to convert to cash: ");
        var input_miles = scanner.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(input_miles);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting " + input_miles +" miles" + " to cash");
        RewardValue rewardsValueMiles = new RewardValue(milesValue);
        System.out.println(input_miles +" miles" + " is worth " + rewardsValueMiles.convertMilesToCash(rewardsValueMiles.getMilesValue()) + " in cash");
    }



}