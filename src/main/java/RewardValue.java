public class RewardValue {
    private double rewardValue;
    public RewardValue(double cashValue) {
        this.rewardValue = cashValue / 100;
    }
    public String getMilesValue() {
        return Double.toString(rewardValue);
    }
}
