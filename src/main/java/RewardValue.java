public class RewardValue {
    double cashValue,milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        milesValue=cashValue*0.0035;
        return milesValue;
    }

}
