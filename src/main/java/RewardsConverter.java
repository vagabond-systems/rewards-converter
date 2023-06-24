import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        //scanner for user input
        var scanner = new Scanner(System.in);

        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        //store input and establish variables
        var input_value = scanner.nextLine();
        double cashValue;
        int milesValue;


        //parse input_value from String to double, catch exceptions
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        //print out what conversion is happening and then perform the conversion and print the results
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.cashToMilesConverter(cashValue) + " miles");

        //prompt to convert the other way
        System.out.println("Convert Miles to Cash value. Input miles.");
        var miles_value = scanner.nextLine();
        //parse input from String to int catching number format exception
        try {
            milesValue = Integer.parseInt(miles_value);
        }catch (NumberFormatException exception){
            System.out.println("Could not parse input to int, exiting");
            return;
        }
        //print out what is being converted and do the conversion, printing the results
        System.out.println("converting " + milesValue + " Miles to cash value.");
        var convertedToCash = new RewardValue(milesValue);
        System.out.println(milesValue + "miles is worth $" + convertedToCash.milesToCashConverter(milesValue));

    }
}