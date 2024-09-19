public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double convertCashToMiles(double miles) {
        return miles / MILES_TO_CASH_CONVERSION_RATE;
    }

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}
