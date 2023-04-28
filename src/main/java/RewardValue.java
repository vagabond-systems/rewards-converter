public class RewardValue {
    protected final double coververdion_rate=0.0035;
    double cash;
    int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles= (int)(cash/ coververdion_rate);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash= miles*coververdion_rate;

    }

    double getCashValue() {
        return this.cash;
    }

    double getMilesValue() {
        return this.miles;
    }
}
