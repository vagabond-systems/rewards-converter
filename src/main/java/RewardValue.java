public class RewardValue {
    private final double cashValues;
    private final int milesValue;
    public static final double conversion_rate = 0.0035;


    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / conversion_rate);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * conversion_rate;
    }

    public double getCashValue() {
        return this.cashValues;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}