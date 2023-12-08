/**
 * The {@code RewardValue} class represents a reward value that can be expressed
 * either in cash or in miles. It provides methods for retrieving the cash value
 * and the equivalent miles value based on a predefined conversion rate.
 * <p>
 * Instances of this class can be created using two constructors: one that accepts
 * a cash value and another that accepts a value in miles.
 * </p>
 * <p>
 * The conversion between miles and cash is performed using a constant conversion rate.
 * </p>
 *
 * @author Nick Mensah
 * @version 1.0
 */
public class RewardValue {
    /** The cash value of the reward. */
    private double cashValue;
    /** The miles value equivalent to the cash value. */
    private double milesValue;
    /** The constant conversion rate from miles to cash. */
    public static final double  VALUE_IN_MILES_RATE = 0.0035;

    /**
     * Constructs a {@code RewardValue} object with the specified cash value.
     *
     * @param cashValue the cash value of the reward.
     */
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    /**
     * Constructs a {@code RewardValue} object with the specified miles value.
     * The cash value is calculated using the predefined conversion rate.
     *
     * @param milesValue the miles value of the reward.
     */
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    /**
     * Converts the specified miles value to its equivalent cash value using
     * the predefined conversion rate.
     *
     * @param milesValue the miles value to be converted.
     * @return the equivalent cash value.
     */
    private static double convertToCash(int milesValue) {
        return milesValue * VALUE_IN_MILES_RATE;
    }

    /**
     * Converts the specified cash value to its equivalent miles value using
     * the predefined conversion rate.
     *
     * @param cashValue the cash value to be converted.
     * @return the equivalent miles value.
     */
    private static int convertToMiles(double cashValue){
        return (int)(cashValue / VALUE_IN_MILES_RATE);
    }

    /**
     * Gets the cash value of the reward.
     *
     * @return the cash value.
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     * Gets the equivalent miles value of the reward.
     *
     * @return the equivalent miles value.
     */
    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
