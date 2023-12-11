public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public RewardValue() {
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    private double convertToMiles(double cashValue){
        return cashValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(double milesValue) {
        this.milesValue = milesValue;
    }
}
