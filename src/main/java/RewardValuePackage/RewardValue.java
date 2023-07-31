package RewardValuePackage;

// define class name
public class RewardValue {

    private double cash;
    private double miles;

    // Define constructor to initalize reward with given value

    public RewardValue(double cash) {
        this.cash = cash; // assigns values from construcrs paramaeter
        this.miles = miles; // assigns values from constructor parameter
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        miles = cash * 0.0035;
        return miles;

    }

}
