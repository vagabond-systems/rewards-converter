public class RewardValue {
    private final double cashValue;
//    private double milesValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertIntoCash(milesValue);
    }

    static int convertIntoMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }
    static double convertIntoCash(int milesValue) {
        return milesValue * conversionRate;
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public int getMilesValue() {
        return convertIntoMiles(this.cashValue);
    }
}
