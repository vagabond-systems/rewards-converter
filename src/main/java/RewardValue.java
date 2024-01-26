public class RewardValue {
    // Miles to cash conversion rate field
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // cash field
    private double cash = 0.0;

    // mile field
    private final double miles =0.0;

    // constructor
    public RewardValue(double cash){
        this.cash = cash;
    }

    // constructor
    public RewardValue(int miles) {
        this.cash = this.CovertMilesToCash(miles);
    }

    // covert miles to cash method
    public double CovertMilesToCash(int miles){
        return  miles * MILES_TO_CASH_CONVERSION_RATE;
    }
    // covert cash to mile method
    public double CovertCashToMiles(double cash){
        return  (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
    }
// 1 mile = $0.0035

    // cash getter
    public double getCashValue() {
        return cash;
    }

    // mile getter
    public double getMilesValue() {
        return CovertCashToMiles(this.cash);
    }
}