/** Represents a reward value.
 * @author Akpotaire Dennis
 * @version 1.3
 * @since 1.0
 */
public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    /** Creates a reward value based on cash.
     *
     * @param cashValue The cash value to be converted to a reward value.
     */
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    /** Creates a reward value based on miles.
     *
     * @param milesValue The mile value to be converted to cash.
     */
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    /** Gets the cash value associated with a particular mile value.
     *
     * @return A double value of the cash value associated with a particular mile or the original cash value.
     */
    public double getCashValue(){
        return milesValue == 0 ? cashValue : convertToCash(milesValue);
    }

    /** Gets the mile value associated with a particular cash value.
     *
     * @return An int value of the mile value associated with a particular cash value or the original mile value.
     */
    public int getMilesValue(){
        return cashValue == 0 ? milesValue : convertToMiles(cashValue);
    }

    /** Convert mile value to cash value
     *
     * @param milesValue The mile value to be converted.
     * @return The cash value after conversion of type double.
     */
    private double convertToCash(int milesValue){
        return (double) Math.round(milesValue * MILES_TO_CASH_CONVERSION_RATE * 100) / 100;
    }

    /** Convert cash value to miles value
     *
     * @param cashValue The cash value to be converted.
     * @return The miles value after conversion of type int.
     */
    private int convertToMiles(double cashValue){
        return (int) Math.ceil((double) Math.round(cashValue / MILES_TO_CASH_CONVERSION_RATE));
    }
}
