public class RewardValue {
    private final double cash;
    private final int miles;
    public static final double conversation_rate = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / conversation_rate);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * conversation_rate;
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }

}




