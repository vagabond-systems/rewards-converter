public class RewardValue {

    private double cash;
    private double miles;

    private final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / CONVERSION_RATE;
    }

    public RewardValue(int miles) {
        this.miles = (double) miles;
        this.cash = miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }

    public double convertCashToMiles() {
        miles = cash / CONVERSION_RATE;
        return miles;
    }

    public double convertMilesToCash() {
        cash = miles * CONVERSION_RATE;
        return cash;
    }
}
