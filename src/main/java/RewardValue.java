public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    public static final double rate = 0.0035;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / rate);
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * rate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
