import java.util.InputMismatchException;
import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Convert cash to miles");
            System.out.println("2. Convert miles to cash");
            System.out.println("3. Exit");

            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        convertCashToMiles(scanner);
                        break;
                    case 2:
                        convertMilesToCash(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please try again.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static void convertCashToMiles(Scanner scanner) {
        double cashValue;
        while (true) {
            System.out.println("Please enter a cash value to convert to airline miles: ");
            try {
                cashValue = scanner.nextDouble();
                if (cashValue <= 0) {
                    System.out.println("Please enter a positive cash value.");
                    continue;
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter a valid cash value.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("converting $" + cashValue + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");
    }

    private static void convertMilesToCash(Scanner scanner) {
        int milesValue;
        while (true) {
            System.out.println("Please enter a miles value to convert to cash: ");
            try {
                milesValue = scanner.nextInt();
                if (milesValue <= 0) {
                    System.out.println("Please enter a positive miles value.");
                    continue;
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter a valid miles value.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("converting " + milesValue + " miles to cash");
        var rewardsValue = new RewardValue(milesValue);
        System.out.println(milesValue + " miles is worth $" + rewardsValue.getCashValue());
    }
}

class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private static final double CASH_TO_MILES_RATE = 1 / MILES_TO_CASH_RATE;

    private double cashValue;
    private int milesValue;

    /**
     * Constructor to create a RewardValue object from a cash value.
     * 
     * @param cashValue the cash value to convert to miles
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    /**
     * Constructor to create a RewardValue object from a miles value.
     * 
     * @param milesValue the miles value to convert to cash
     */
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    /**
     * Getter method to retrieve the cash value.
     * 
     * @return the cash value
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     * Getter method to retrieve the miles value.
     * 
     * @return the miles value
     */
    public int getMilesValue() {
        return milesValue;
    }

    /**
     * Method to convert cash value to miles.
     * 
     * @param cashValue the cash value to convert
     * @return the equivalent miles value
     */
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue * CASH_TO_MILES_RATE);
    }

    /**
     * Method to convert miles value to cash.
     * 
     * @param milesValue the miles value to convert
     * @return the equivalent cash value
     */
    private double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }
}
