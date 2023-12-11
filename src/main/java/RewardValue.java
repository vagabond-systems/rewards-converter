public class RewardValue {

    private final double cashValue;

    //cash constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    //miles constructor
    public RewardValue (int milesValue) {
        this.cashValue = milesValue * .0035;
    }

    //getters
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / .0035);
    }

}
