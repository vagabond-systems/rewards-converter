public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (0.0035 * cashValue);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}
