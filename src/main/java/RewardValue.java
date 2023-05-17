public class RewardValue {
    double miles;
    double cash;
    double rate = 0.0035;
    RewardValue(double cashValue) {
        cash = cashValue;
    }
    RewardValue(int mileValue) {
        miles = mileValue;
    }

    public double getCashValue() {
        return miles * rate;
    }

    public int getMilesValue() {
        return (int) (cash / rate);
    }
}
