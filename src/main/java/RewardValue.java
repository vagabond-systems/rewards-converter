public class RewardValue {
    public double cash = 0;
    public int miles = 0;

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        //RewardValue must convert from miles to cash at a rate of 0.0035.
        // 1 mile = $0.0035
        return miles > 0 ? miles * 0.0035 : cash;
    }

    public int getMilesValue() {
        //RewardValue must convert from miles to cash at a rate of 0.0035.
        // 1 mile = $0.0035
        return cash > 0 ? (int) (cash / 0.0035) : miles;
    }
}
