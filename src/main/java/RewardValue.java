public class RewardValue {
    /* Private Instance variables */
    private double cashValue;
    private float milesValue;

    /* Constructor for milesValue */
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    /* Constructor for cashValue */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    /* Get method for getCashValue */
    public double getCashValue() {
        return cashValue;
    }

    /* Conversion method for getMilesValue :By converting to cashValue at a rate of 0.0035 */
    public float getMilesValue() {
        return (float) (cashValue * 0.0035);
    }

}
