public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035; // given conversion rate

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = convertFromCashToMiles(cash);
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = convertFromMilesToCash(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static double convertFromCashToMiles(double cash) {
        return cash / MILES_TO_CASH_RATE;
    }

    public static double convertFromMilesToCash(double miles) {
        return miles * MILES_TO_CASH_RATE;
    }
}
