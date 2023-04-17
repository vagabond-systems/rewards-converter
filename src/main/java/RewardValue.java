public class RewardValue {
    /* Private Instance variables */
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    /* Constructor for cashValue */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    /* Constructor for milesValue */
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    /* Conversion method for getMilesValue :By converting to cashValue at a rate of 0.0035 */
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }

    /* Get method for getCashValue */
    public double getCashValue() {
        return cashValue;
    }
    /* Get method for getMilesValue */
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}