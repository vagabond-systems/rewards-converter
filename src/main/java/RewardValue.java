public class RewardValue {

    private static final double Miles_To_Cash = 0.0035;
    private double cashValue;
    private int milesValue;

    public RewardValue (double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/Miles_To_Cash);
    }

    public RewardValue (int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*Miles_To_Cash;
    }

    public double getCashValue() {return cashValue;}

    public double getMilesValue() {
        return milesValue;
    }
}
