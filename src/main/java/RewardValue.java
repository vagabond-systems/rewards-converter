import java.math.BigDecimal;

public class RewardValue {
    private int mileValue;
    private double cashValue;
    private final boolean initializedWithCash;
    private final BigDecimal MILE_TO_CASH_CONVERSION_RATE = new BigDecimal("0.0035");
    //The issue with double inconsistency is that the value is not a whole number
    //Pivot to BigDecimal to be more precise and reconvert it to double when needed

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = convertCashToMile(cashValue);
        this.initializedWithCash = true;
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
        this.cashValue = convertMileToCash(mileValue);
        this.initializedWithCash = false;
    }

    public double getCashValue() {
        if (initializedWithCash) {
            return this.cashValue;
        } else {
            return convertMileToCash(this.mileValue);
        }
    }


    public int getMilesValue() {
        if (initializedWithCash) {
            return convertCashToMile(this.cashValue);
        } else {
            return this.mileValue;
        }
    }
}
