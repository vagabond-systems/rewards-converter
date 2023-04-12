public class RewardValue {
    private double cashValue;
    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.cashValue = convertMilesToCash(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    private static int convertCashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    private static double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }
}
