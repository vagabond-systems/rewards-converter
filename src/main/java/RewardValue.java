public class RewardValue {
    private double cash;
    private double miles;

    public RewardValue(double cashValue) {
        cash = cashValue;
        miles = cashValue * 0.0035;
    }

    public RewardValue(int milesValue){
        miles = milesValue;
        cash = milesValue / 0.0035;
    }

    public double getMilesValue() {
        return this.miles;
    }

    public double getCashValue() {
        return this.cash;
    }
}
