import java.math.BigDecimal;
import java.util.logging.Logger;
import java.util.logging.Level;

public final class RewardValue {
    private static final Logger LOGGER = Logger.getLogger(RewardValue.class.getName());
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public static final double DEFAULT_CASH_TO_MILES_CONVERSION_RATE = 1 / MILES_TO_CASH_CONVERSION_RATE;

    private final BigDecimal cashValue;
    private final BigDecimal milesValue;
    private final double customCashToMilesRate;

    public RewardValue(double cashValue) {
        if (cashValue < 0) {
            LOGGER.log(Level.SEVERE, "Attempted to create RewardValue with negative cash value");
            throw new IllegalArgumentException("Cash value cannot be negative");
        }
        this.customCashToMilesRate = DEFAULT_CASH_TO_MILES_CONVERSION_RATE;
        this.cashValue = BigDecimal.valueOf(cashValue);
        this.milesValue = convertCashToMiles(this.cashValue);
        LOGGER.log(Level.INFO, "Created RewardValue with cash value: " + cashValue);
    }


    /**
     * Constructor for RewardValue using mile value.
     * The cash value is calculated based on the current conversion rate.
     *
     * @param milesValue      The mile value to be converted into cash.
     * @param useMilesAsInput A flag to indicate that the value is in miles.
     * @throws IllegalArgumentException if milesValue is negative.
     */
    public RewardValue(double milesValue, boolean useMilesAsInput) {
        if (milesValue < 0) {
            throw new IllegalArgumentException("Miles value cannot be negative");
        }


        this.customCashToMilesRate = DEFAULT_CASH_TO_MILES_CONVERSION_RATE;
        this.milesValue = BigDecimal.valueOf(milesValue);
        this.cashValue = convertMilesToCash(this.milesValue);
    }

    /**
     * Returns the cash value of the reward.
     *
     * @return The cash value as a BigDecimal.
     */
    public BigDecimal getCashValue() {
        return this.cashValue;
    }

    /**
     * Returns the mile value of the reward.
     *
     * @return The miles value as a BigDecimal.
     */
    public BigDecimal getMilesValue() {
        return this.milesValue;
    }

    /**
     * Converts a given cash value to airline miles based on the current conversion rate.
     *
     * @param cash The cash value to convert.
     * @return The equivalent miles as a BigDecimal.
     */
    private BigDecimal convertCashToMiles(BigDecimal cash) {
        return cash.multiply(BigDecimal.valueOf(customCashToMilesRate));
    }

    /**
     * Converts a given miles value to cash based on the current conversion rate.
     *
     * @param miles The miles value to convert.
     * @return The equivalent cash as a BigDecimal.
     */
    private BigDecimal convertMilesToCash(BigDecimal miles) {
        return miles.multiply(BigDecimal.valueOf(MILES_TO_CASH_CONVERSION_RATE));
    }

    /**
     * Returns a string representation of the RewardValue object.
     *
     * @return A string representation of the RewardValue object.
     */
    @Override
    public String toString() {
        return "RewardValue{" +
                "cashValue=" + cashValue +
                ", milesValue=" + milesValue +
                ", customCashToMilesRate=" + customCashToMilesRate +
                '}';
    }
}