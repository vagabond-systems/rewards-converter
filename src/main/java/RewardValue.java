public class RewardValue {
    private final double cashValue;
    public static final double conversion_rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / conversion_rate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * conversion_rate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}
