public class RewardValue {
    
    /* Declare Variables */
    private final double cashValue;
    public static final double conversionRate = 0.0035;

    /* Declare constructors */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue (int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    /* Declare methods */
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    private static double convertToCash(int milesValue) {
        return (double) (milesValue * conversionRate);
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}