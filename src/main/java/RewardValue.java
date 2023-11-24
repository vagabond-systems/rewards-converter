import java.math.BigDecimal;

public class RewardValue {
    private int mileValue;
    private final BigDecimal MILE_TO_CASH_CONVERSION_RATE = new BigDecimal("0.0035");
    //The issue with double inconsistency is that the value is not a whole number
    //Pivot to BigDecimal to be more precise and reconvert it to double when needed

    public RewardValue(double cashValue) {
        this.mileValue = convertCashToMile(cashValue);
    }


    // Convert miles to cash
    // Needs to check the edge cases where the value is not a whole number
    private double convertMileToCash(int mileValue) {
        BigDecimal miles = new BigDecimal(mileValue);
        return miles.multiply(MILE_TO_CASH_CONVERSION_RATE).doubleValue();
    }

    private int convertCashToMile(double cashValue) {
        BigDecimal cash = new BigDecimal(cashValue);
        // Use ROUND_HALF_UP for rounding similar to Math.round
        BigDecimal miles = cash.divide(MILE_TO_CASH_CONVERSION_RATE, BigDecimal.ROUND_HALF_UP);
        return miles.intValue();
    }

    //Java require overloaded constructor to have different types of sequences of parameters
    //So I'm assuming there are no partial miles(e.g. 0.5 miles)

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
    }

    public double getCashValue() {
        //convert cash value to miles
        return  convertMileToCash(this.mileValue);
    }

    public int getMilesValue() {
        //convert miles value to cash
        //At this stage of the project, I'm assuming that get MileValues is the only
        //method that do the conversion. In the future, I expected to have a method that
        //do the calculation and return the value separately.
        return this.mileValue;
    }
}
