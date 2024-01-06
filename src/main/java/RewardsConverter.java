import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a value and specify whether it is in cash (C) or miles (M): ");

        var input_value = scanner.nextLine();
        double value;
        boolean isCash;

        try {
            value = Double.parseDouble(input_value.substring(0, input_value.length() - 1));
            char valueType = Character.toUpperCase(input_value.charAt(input_value.length() - 1));
            isCash = (valueType == 'C');

            System.out.println("Converting $" + value + " to miles");
            var rewardsValue = new main.java.RewardValue(value, isCash);
            System.out.println("$" + value + " is worth " + rewardsValue.getMilesValue() + " miles");
        } catch (NumberFormatException | StringIndexOutOfBoundsException exception) {
            System.out.println("Invalid input format, exiting");
        }
    }
}
