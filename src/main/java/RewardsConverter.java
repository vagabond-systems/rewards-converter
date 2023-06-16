import java.util.Scanner;

public class RewardsConverter {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Welcome to the Credit Card Rewards Converter!");
		System.out.print("Please enter a cash value to convert to airline miles: $");
		var input_value = scanner.nextLine();
		double cashValue;
		try {
			cashValue = Double.parseDouble(input_value);
		} catch (NumberFormatException exception) {
			System.out.println("Could not parse input value as a double, exiting");
			return;
		}
		System.out.println("converting $" + input_value + " to miles");
		double cashToMiles = RewardValue.convertFromCashToMiles(cashValue); // conversion method from RewardValue class
		String formatMilesToThreeDecimals = String.format("%.3f", cashToMiles);
		System.out.println("Cash value entered: $" + input_value + ".");
		System.out.println("$" + input_value + " is worth " + formatMilesToThreeDecimals + " miles.");
		System.out.println("Thank you for choosing JPMorgan Chase, have a great day.");
	}
}

/*
EXAMPLE OUTPUT:

Welcome to the Credit Card Rewards Converter!
Please enter a cash value to convert to airline miles: $1799.00
converting $1799.00 to miles
Cash value entered: $1799.00.
$1799.00 is worth 514000.000 miles.
Thank you for choosing JPMorgan Chase, have a great day.
 */
