public class RewardValue {
    private static final double CONVERSION = 0.0035;
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
        return cashValue / CONVERSION;

    }

    private double convertToCash(double milesValue){
        return milesValue / CONVERSION;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }
}
