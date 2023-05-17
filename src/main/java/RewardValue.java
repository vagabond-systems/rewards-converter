public class RewardValue {
    private double cashValue = 0;
    public static final double CASH_TO_MILE_CONVERSION_RATE = 0.0035;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int miles) {
        this.cashValue = mileToCashValue(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        //RewardValue must convert from miles to cash at a rate of 0.0035.
        // 1 mile = $0.0035
        return cashValueToMiles(cashValue);
    }

    public double mileToCashValue(double cashValue) {
        return cashValue * CASH_TO_MILE_CONVERSION_RATE;
    }

    public int cashValueToMiles(double cashValue) {
        return (int) (cashValue / CASH_TO_MILE_CONVERSION_RATE);
    }
}
