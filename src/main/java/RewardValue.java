public class RewardValue {
    private double rate = 0.0035;
    private double _cash;

    public RewardValue(double cash) {
        _cash = cash;
    }

    public RewardValue(int miles) {
        _cash = miles * rate;
    }

    public double getCashValue() {
        return _cash;
    }

    public int getMilesValue() {
        return (int)(_cash / rate);
    }
}
