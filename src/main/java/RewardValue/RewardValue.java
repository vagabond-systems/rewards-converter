package RewardValue;

public class RewardValue {
    private final double cash;
    public static final double miles_to_cash_conversion_rate = 0.0035;
//    double miles;
    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cash = convertToCash(milesValue); // when we have miles with us we use convert_to_cash to get cash
    }

    public double convertToCash(int milesValue) {
        return milesValue*miles_to_cash_conversion_rate;
    }

    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue() {
        return (int) (this.cash/miles_to_cash_conversion_rate);
    }
}
