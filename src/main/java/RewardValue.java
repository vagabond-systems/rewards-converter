public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue= converttomiles();
    }

    public RewardValue(int milesValue) {
        this.milesValue= milesValue;
        this.cashValue= getCashValueFromMiles();
    }



    public double getCashValue() {
        return cashValue;
    }


    public int getMilesValue() {
        return milesValue;
    }
  public int converttomiles() {
        return (int) (cashValue / 0.0035); // Convert cash value to miles
    }

    public double getCashValueFromMiles() {
        return milesValue * 0.0035; // Convert miles to cash value
    }
}
