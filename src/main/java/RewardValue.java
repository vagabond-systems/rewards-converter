public class RewardValue {
    private final double cashValue;
    public static final double cashValueInMiles=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = cash(milesValue);
    }

    private static int miles(double cashValue) {
        return (int)(cashValue/cashValueInMiles);
    }

    private static double cash(int milesValue) {
        return milesValue*cashValueInMiles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return miles(this.cashValue);
    }
}