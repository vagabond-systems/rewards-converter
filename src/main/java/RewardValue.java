public class RewardValue {

    // Instance variables
    private double cash;
    private double miles;
    private final double CONVERSION_RATE = 0.0035;

    // Constructors
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash * CONVERSION_RATE;
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles / CONVERSION_RATE;
    }

    // Getters
    public double getCashValue() {
        return (double) (Math.round(cash * 100.0) / 100.0);
    }

    public double getMilesValue() {
        return (double) (Math.round(miles * 100.0) / 100.0);
    }

}
