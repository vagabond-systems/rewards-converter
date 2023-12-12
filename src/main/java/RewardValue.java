public class RewardValue {

    //instance variables
    double cashValue = 100;
    int milesValue = 10000;
    private static final double milesToCashConversionRate = 0.0035;

    // constructors
    public RewardValue(double cashValue) {
        if (cashValue < 0) {
            throw new IllegalArgumentException("Cash value must be positive");
        }
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        if (milesValue < 0) {
            throw new IllegalArgumentException("Miles value must be positive");
        }
        this.milesValue = milesValue;

    }

    // methods
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    // conversions
    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / milesToCashConversionRate);
    }

    public static double convertToCash(int milesValue) {
        return milesValue * milesToCashConversionRate;


    }

}