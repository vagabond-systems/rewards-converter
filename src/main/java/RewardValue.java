public class RewardValue {

    private final double cash;
    private final double MILE_TO_CASH_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int mile) {
        cash = mile * MILE_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return (int)(cash /MILE_TO_CASH_RATE);
    }
}
