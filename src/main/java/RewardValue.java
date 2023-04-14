/** Represents a reward value.
 * @author Akpotaire Dennis
 * @version 1.0
 * @since 1.0
 */
public class RewardValue {
    private double cash;
    private int mile;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    /** Creates a reward value based on cash.
     * @param cash The cash value to be converted to a reward value.
     */
    public RewardValue(double cash){
        this.cash = cash;
    }

    /** Creates a reward value based on miles.
     * @param mile The mile value to be converted to cash.
     */
    public RewardValue(int mile){
        this.mile = mile;
    }

    /** Gets the cash value associated with a particular mile value.
     * @return A double value of the cash value associated with a particular mile or the original cash value.
     */
    public double getCashValue(){
        return mile == 0 ? cash : (double) Math.round(mile * MILES_TO_CASH_CONVERSION_RATE * 100) / 100;
    }

    /** Gets the mile value associated with a particular cash value.
     * @return An int value of the mile value associated with a particular cash value or the original mile value.
     */
    public int getMilesValue(){
        return cash == 0 ? mile : (int) Math.ceil((int) Math.round(cash / MILES_TO_CASH_CONVERSION_RATE));
    }

}
