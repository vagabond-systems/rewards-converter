public class RewardValue {
    private double milesValue;
    private double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) milesValue;
    }

}
