public class RewardValue {

    protected int milesValue;
    protected double cashValue;

    /* constructor using miles */
    public RewardValue(int milesValue) {
        setMilesValue(milesValue);
    }

    /*
     * Constructor using cash
     */
    public RewardValue(double cashValue) {
        setCashValue(cashValue);
    }

    private void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    /*
     * @Desc: convert cash value to mile
     * 
     */
    public int cashToMile() {
        int holder = (int) getCashValue();
        int result = (int) (holder / 0.0035);
        // System.out.println(result);
        return result;
    }

    /*
     * @Desc: Convert mile to cash
     * 
     */
    public double mileToCash() {
        double holder = (double) getMilesValue();
        double result = (double) (holder * 0.0035);
        return result;
    }
}
