public class RewardValue {
    private double rate = 0.0035;
    private double _miles;
    private double _cash;

    public RewardValue(double cash) {
        _cash = cash;
        _miles = (_cash / rate);
    }

    public RewardValue(int miles) {
        _miles = miles;
        _cash = _miles * 0.0035;
    }

    public double getCashValue() {
        return _cash;
    }

    public int getMilesValue() {
        return (int)_miles;
    }
}
