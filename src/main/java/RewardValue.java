public class RewardValue {
    double cashValue;
    double miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }


    public double getMilesValue() {
        return cashValue / 0.0035;
    }

}
