/***
 * RewardValue class for business logic for
 * calculating miles from cash and vice versa
 *
 * @author sohail2499
 */
public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    public static final double MILES_T0_CASH_RATE = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    /**
     * Gets the cash values
     * @return int - miles value
     */
    public int getMilesValue() {
        return (int) (milesValue);
    }


    /**
     * Gets the cash value from given miles
     * @param miles - airlines Miles
     * @return double - cash value
     */
    private double milesToCash(double miles) {
        return Math.floor(miles * MILES_T0_CASH_RATE);
    }


    /**
     * Gets the cash values
     * @return double -  cash value
     */
    public double getCashValue() {
        return cashValue;
    }


    /**
     * Gets the miles from given cash value
     * @param cash - cash value
     * @return int - miles value
     */
    private int cashToMiles(double cash) {
        return (int) (cash / MILES_T0_CASH_RATE);
    }

}
