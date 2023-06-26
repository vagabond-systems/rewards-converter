public class RewardValue {
    private final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int)(cashValue / CASH_TO_MILES_CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * CASH_TO_MILES_CONVERSION_RATE;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return miles;
    }
}
