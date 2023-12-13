public class RewardValue {

    private double cashValue;
    private double milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        convertCashToMiles(cashValue);
    }

    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
        convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private void convertCashToMiles(double cashValue){
        this.milesValue = cashValue * 0.0035;
    }

    private void convertMilesToCash(double milesValue){
        this.cashValue = milesValue / 0.0035;
    }
}
