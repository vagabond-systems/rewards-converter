public class RewardValue {

    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    // // Is this conversion value correct? Seems like a ridiculous Conversion Rate
    // // $1000 -> 285,714 miles
    // // 1000 miles -> $3.5

    // private final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;
    // private double cashValue;
    // private int miles;

    // public RewardValue(double cashValue) {
    // this.cashValue = cashValue;
    // this.miles = (int)(cashValue / CASH_TO_MILES_CONVERSION_RATE);
    // }

    // public RewardValue(int miles) {
    // this.miles = miles;
    // this.cashValue = miles * CASH_TO_MILES_CONVERSION_RATE;
    // }

    // public double getCashValue() {
    // return cashValue;
    // }

    // public int getMilesValue() {
    // return miles;
    // }
}
