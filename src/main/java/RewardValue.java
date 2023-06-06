public class RewardValue {
    public static final double MILES_TO_CASH_EXCHANGE_RATE = 0.0035;
    private final double cashValue;
    private final int milesValue;

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_EXCHANGE_RATE;

    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)Math.floor(cashValue / MILES_TO_CASH_EXCHANGE_RATE);
    }
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

/*Although this is the asked way to calculate the reward value. Before knowing what datatypes that cashValue and milesValue were.
I wanted to approach it with different classes for each the milesValue and cashValue, and rewardValue. So there wouldn't be any conversions needed between the two classes and the constructors.
*/