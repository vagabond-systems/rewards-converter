public class RewardValue {
double rewardValue;

    public RewardValue(double cashValue) {
        rewardValue= cashValue;
    }
    public RewardValue(int milesValue) {
        rewardValue= milesValue;
    }

    public double getMilesValue() {
        return  (rewardValue*(1+0.0035));
    }
    public double getCashValue() {
        return (int) rewardValue;

    }
}
