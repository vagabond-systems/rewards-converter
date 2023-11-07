public class RewardValue {
    private final Double cashValue;

    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
    }

    public Double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (getCashValue() / 0.0035);
    }
}
