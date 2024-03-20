public class RewardValue {
    private double cash;
    private int miles;
    private static final double CONVERSION = 0.0035;

    public RewardValue(double cashVal) {
        cash = cashVal;
        miles = (int) (cashVal / CONVERSION);
    }

    public RewardValue(int mileage) {
        miles = mileage;
        cash = mileage * CONVERSION;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}
