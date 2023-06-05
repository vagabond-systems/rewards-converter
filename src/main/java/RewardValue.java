public class RewardValue {
    private final static double MILES_TO_CASH_EXCHANGE_RATE = 0.0035;
    private final double cashValue;
    private final int milesValue;

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_EXCHANGE_RATE;

    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)Math.floor(cashValue / MILES_TO_CASH_EXCHANGE_RATE);
    }
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}







// constuctor overloading in Java