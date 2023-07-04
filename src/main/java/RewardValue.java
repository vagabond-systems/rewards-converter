public class RewardValue {

    // Instance variables
    private double cash;
    private double miles;

    // Constructors
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    // Public methods
    public double getCashValue() {
        if (cash == 0) {
            cash = miles / 0.0035;
        }
        return (double) (Math.round(cash * 100.0) / 100.0);
    }

    public double getMilesValue() {
        if (miles == 0) {
            miles = cash * 0.0035;
        }
        return (double) (Math.round(miles * 100.0) / 100.0);
    }


}
