public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    private double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }

    private int convertCashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }
}
