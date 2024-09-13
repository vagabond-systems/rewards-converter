public class RewardValue {

    private double cashValue;
    private int milesValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / conversionRate);
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }


    public double getCashValue() {
        return cashValue;
    }


    public int getMilesValue() {
        return milesValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / conversionRate);
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }
}

