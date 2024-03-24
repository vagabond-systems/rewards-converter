public class RewardValue {
    static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    double rewardCashValue;
    int rewardMilesValue;


    public RewardValue(double cash) {
        this.rewardCashValue = cash;
    }

    public RewardValue(int miles) {
        this.rewardMilesValue = miles;
    }

    private static int convertToMiles(double cash) {
        return (int) (cash * MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int miles) {
        return miles / MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        if (rewardCashValue != 0) {
            return rewardCashValue;
        } else {
            return convertToCash(rewardMilesValue);
        }
    }

    public int getMilesValue() {
        if (rewardMilesValue != 0) {
            return rewardMilesValue;
        } else {
            return convertToMiles(rewardCashValue);
        }
    }

}
