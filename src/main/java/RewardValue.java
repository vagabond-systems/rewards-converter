public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue(){
        return (int) (this.milesValue>0?this.milesValue: (int) this.cashValue*0.0035);
    }
}
