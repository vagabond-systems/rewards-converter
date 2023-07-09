public class RewardValue {
    double dCashVal;
    int iMilesVal;

    public RewardValue(double cash) {
        this.dCashVal = cash;
        this.iMilesVal = (int)(cash / 0.0035);
    }

    public RewardValue(int miles) {
        this.iMilesVal = miles;
        this.dCashVal = (float)(miles * 0.0035);
    }

    public double getCashValue() {
        return dCashVal;
    }

    public int getMilesValue() {
        return iMilesVal;
    }
}
