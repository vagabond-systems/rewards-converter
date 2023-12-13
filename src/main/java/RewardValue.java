public class RewardValue {
    private static final double CONVERSION_RATE = 0.0035;
    private double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(long miles) {
        this.cash = convertMilesToCash(miles);
    }

    public double getCashValue() {
        return cash;
    }

    public long getMilesValue() {
        return convertCashToMiles(cash);
    }

    public double convertMilesToCash(long miles) {
        return miles * CONVERSION_RATE;
    }

    public long convertCashToMiles(double cash) {
        return (long) (cash / CONVERSION_RATE);
    }

}



