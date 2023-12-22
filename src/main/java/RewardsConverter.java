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
    }
}

//my code
public class RewardValue {
public double cashVal ;
    public double milesVal;
//constructors
    public RewardValue(double cashVal)
    {
        this.cashVal=cashVal;
        this.milesVal=convertCashToMiles(cashVal);
    }
    public RewardValue(double milesVal)
    {
        this.milesVal=milesValue;
        this.cashVal=convertMilesToCash(milesVal);
    }

    //get the cash value
    public double getCashValue() 
    {
        return cashVal;
    }

    //get the miles value
    public double getMilesValue()
    {
        return milesVal;
    }
//cash to mile method
     private double convertCashToMiles(double cashVal)
    
    {
        return cashVal / 0.0035;
    }

    //mile to cash method
    private double convertMilesToCash(double milesVal)
    {
        return milesVal * 0.0035;
    }

}
