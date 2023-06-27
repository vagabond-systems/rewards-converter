public class RewardValue {

    // Is this conversion value correct? Seems like a ridiculous Conversion Rate
    // $1000 -> 285,714 miles
    // 1000 miles -> $3.5
    
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return miles;
    }
}
