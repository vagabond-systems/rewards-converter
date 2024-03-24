public class RewardValue {
    final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    double rewardCashValue;
    double rewardMilesValue;


    public RewardValue(double cash) {
        rewardCashValue = cash;
    }

    public RewardValue(int miles) {
        rewardMilesValue = miles;
    }

    public double getCashValue() {
        return rewardCashValue;
    }

    public double getMilesValue() {
        return rewardCashValue * MILES_TO_CASH_CONVERSION_RATE;
    }

}
