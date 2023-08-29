public class RewardValue {
    // Instance variables
    private final double cashValue;
    public static final double conversionRate = 0.0035;


    // Constructors

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * conversionRate;
    }


    // Methods
    public double getCashValue() {
       return this.cashValue;
    }

    public double getMilesValue() {
        return Math.round(this.cashValue / conversionRate);
    }




}
