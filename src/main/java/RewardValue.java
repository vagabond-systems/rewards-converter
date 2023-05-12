public class RewardValue {
    private double value;

    public RewardValue(double cash) {
        this.value = cash;
    }

    public RewardValue(int miles) {
        this.value = miles;
    }

    public double getCashValue() {
        return value / 0.0035;
    }

    public double getMilesValue() {
        return value * 0.0035;
    }
}

