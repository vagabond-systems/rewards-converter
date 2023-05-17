public class RewardValue {
    private double cashValue = 0;

    private final double CASH_TO_MILE_VALUE = 0.0035;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int miles) {
        this.cashValue = mileToCashvalue(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        //RewardValue must convert from miles to cash at a rate of 0.0035.
        // 1 mile = $0.0035
        return cashvalueToMiles(cashValue);
    }

    public double mileToCashvalue(double cashValue) {
        return cashValue * CASH_TO_MILE_VALUE;
    }

    public int cashvalueToMiles(double cashValue) {
        return (int) (cashValue / CASH_TO_MILE_VALUE);
    }
}
