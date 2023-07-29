public class RewardValue {

    private double cash;
    public static double rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cash = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        // return cash value of the RewardValue
        return this.cash;
    }

    public int getMilesValue() {
        // return how many miles the RewardValue is worth
        return convertCashToMiles(this.cash);
    }

    private static int convertCashToMiles(double cashValue) {
        return (int)(cashValue / rate);
    }

    private static double convertMilesToCash(int milesValue) {
        return (milesValue * rate);
    }
}