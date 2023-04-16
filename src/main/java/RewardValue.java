public class RewardValue {
    double milesValue;
    double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue;
    }

    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

}
