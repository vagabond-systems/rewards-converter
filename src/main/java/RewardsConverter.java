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
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        //System.out.println("$" + input_value + " is worth $" + String.format("%.2f",rewardsValue.getCashValue()) + " dollars as credit");
    }
}

class RewardValue {

    private double inputCash = 0.0;
    private int inputMiles = 0;
    private int outputMiles;
    private double outputCash;


    double conversion = 0.0035;  //Miles to Cash Conversion rate


    public RewardValue(double inputCash) {
        this.inputCash = inputCash;
    }
    public RewardValue(int inputMiles) {
        this.inputMiles = inputMiles;
    }
    public double getCashValue() {
        outputMiles = getMilesValue();
        outputCash = outputMiles * conversion;
        return outputCash;
    }

    public int getMilesValue() {
        if (inputCash > 0 && inputMiles == 0) {
            outputMiles = (int)(inputCash / conversion);
        }
        else if (inputCash == 0 && inputMiles > 0) {
            outputMiles =  inputMiles;
        }
        return outputMiles;

    }
}

